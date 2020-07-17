package com.smday.netctoss.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smday.netctoss.common.StringUtils;
import com.smday.netctoss.mbg.mapper.AccountMapper;
import com.smday.netctoss.mbg.mapper.ServiceMapper;
import com.smday.netctoss.mbg.model.Account;
import com.smday.netctoss.mbg.model.Service;
import com.smday.netctoss.mbg.model.ServiceExample;
import com.smday.netctoss.service.IServiceService;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.awt.peer.CanvasPeer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Summerday
 */

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements IServiceService {

    @Resource
    ServiceMapper serviceMapper;
    @Resource
    AccountMapper accountMapper;

    @Override
    public List<Service> findList() {
        return serviceMapper.selectByExample(null);
    }


    @Override
    public List<Service> findListByExample(Map<String, Object> searchMap) {

        ServiceExample example = new ServiceExample();
        ServiceExample.Criteria criteria = example.createCriteria();
        String osUsername = (String) searchMap.get("osUsername");
        String unixHost = (String) searchMap.get("unixHost");
        String idcardNo = (String) searchMap.get("idcardNo");
        String status = (String) searchMap.get("status");

        //创建条件对象
        if (StringUtils.isNotEmpty(osUsername)) {
            criteria.andOsUsernameLike("%" + osUsername + "%");
        }
        if (StringUtils.isNotEmpty(unixHost)) {
            criteria.andUnixHostEqualTo(unixHost);
        }
        List<Service> services = serviceMapper.selectByExample(example);
        if (StringUtils.isEmpty(idcardNo) && StringUtils.isEmpty(status)) {
            return services;
        }
        List<Service> newList = new ArrayList<>();

        for (Service service : services) {

            //填了两个信息
            if (StringUtils.isNotEmpty(idcardNo) && StringUtils.isNotEmpty(status)) {
                if (idcardNo.equals(service.getAccount().getIdcardNo()) && status.equals(service.getStatus())) {
                    newList.add(service);
                }
            }
            //只有身份真
            if (StringUtils.isNotEmpty(idcardNo)) {
                service.setAccount(accountMapper.selectByPrimaryKey(service.getServiceId()));
                if (idcardNo.equals(service.getAccount().getIdcardNo())) {
                    newList.add(service);
                }
            }
            //只有状态
            if (StringUtils.isNotEmpty(status)) {
                if (status.equals(service.getStatus())) {
                    newList.add(service);
                }
            }

        }
        return newList;
    }

    @Override
    public List<Service> findPage(int page, int size) {
        PageHelper.startPage(page, size);
        return (Page<Service>) this.findList();
    }

    @Override
    public List<Service> findPageByExample(Map<String, Object> searchMap, int page, int size) {
        PageHelper.startPage(page, size);
        return (List<Service>) (Page<Service>) this.findListByExample(searchMap);

    }

    @Override
    public Service findById(Integer id) {
        return serviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(Service service) {
        return serviceMapper.insert(service);
    }

    @Override
    public int update(Service service) {
        return serviceMapper.updateByPrimaryKey(service);
    }

    @Override
    public int updateStatus(Integer serviceID) {

        //根据id找到service
        Service service = findById(serviceID);

        String status = service.getStatus();
        if ("1".equals(status) || "2".equals(status)) {
            service.setStatus("0");
        } else {
            service.setStatus("1");
        }
        //更改service的status值即可
        return update(service);
    }

    @Override
    public int delete(Integer serviceID) {
        //根据id找到service
        Service service = findById(serviceID);
        service.setStatus("3");
        //更改service的status值即可
        return update(service);
    }

    @Override
    public int add(Map<String, Object> map) {
        System.out.println((String)map.get("accountId"));
        System.out.println( (String)map.get("costId"));
        System.out.println(map);
        Integer accountId = Integer.parseInt( (String)map.get("accountId"));
        Integer costId = Integer.parseInt( (String)map.get("costId"));
        String password = (String) map.get("password");
        ServiceExample example = new ServiceExample();
        example.createCriteria().andAccountIdEqualTo(accountId);
        List<Service> services = serviceMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(services)){
            return 0;
        }
        Service service = services.get(0);
        service.setCostId(costId);
        service.setLoginPasswd(password);
        return update(service);
    }
}

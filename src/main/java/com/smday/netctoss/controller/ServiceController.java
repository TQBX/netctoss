package com.smday.netctoss.controller;

import com.github.pagehelper.Page;
import com.smday.netctoss.common.AjaxResult;
import com.smday.netctoss.mbg.model.Account;
import com.smday.netctoss.mbg.model.Cost;
import com.smday.netctoss.mbg.model.Service;
import com.smday.netctoss.service.IAccountService;
import com.smday.netctoss.service.ICostService;
import com.smday.netctoss.service.IServiceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 业务控制
 *
 * @author Summerday
 */
@RestController
public class ServiceController {

    @Resource
    IServiceService serviceService;

    @Resource
    IAccountService accountService;

    @Resource
    ICostService costService;


    @GetMapping("/findList")
    public AjaxResult findList() {
        List<Service> list = serviceService.findList();
        List<Service> newList = new ArrayList<>();
        for (Service service : list) {
            Account byId = accountService.findById(service.getServiceId());
            service.setAccount(byId);
            Cost cost = costService.findById(service.getCostId());
            service.setCost(cost);
            newList.add(service);
        }

        AjaxResult ajax = AjaxResult.success();
        ajax.put("list", newList);
        return ajax;
    }

    @GetMapping("/findPage")
    public AjaxResult findPage(int page, int size) {
        Page<Service> services = (Page<Service>) serviceService.findPage(page, size);
        AjaxResult success = AjaxResult.success();
        success.put("rows", services.getResult());
        success.put("total", services.getTotal());
        return success;
    }

    @PostMapping("/findList")
    public AjaxResult findByExample(@RequestBody Map<String, Object> searchMap) {
        //osName , unixHost, idcardNo,status,
        List<Service> listByExample = serviceService.findListByExample(searchMap);
        if (listByExample != null) {
            for (Service service : listByExample) {
                service.setAccount(accountService.findById(service.getServiceId()));
                service.setCost(costService.findById(service.getCostId()));
            }
        }
        return AjaxResult.success(listByExample);
    }

    @PostMapping("/findPage")
    public AjaxResult findPageByExample(@RequestBody Map<String, Object> searchMap, int page, int size) {
        Page<Service> services = (Page<Service>) serviceService.findPageByExample(searchMap, page, size);
        AjaxResult success = AjaxResult.success();
        success.put("rows", services.getResult());
        success.put("total", services.getTotal());
        return success;
    }

    @GetMapping("/services/{id}")//serviceId
    public AjaxResult getDetails(@PathVariable Integer id) {

        Service service = serviceService.findById(id);
        Account account = accountService.findById(id);
        service.setAccount(account);
        Cost cost = costService.findById(service.getCostId());
        service.setCost(cost);
        return AjaxResult.success(service);
    }

    @PostMapping("/services/{id}")//serviceId
    public AjaxResult getDetails(@PathVariable Integer id, @RequestBody Map<String, Object> map) {
        System.out.println(map.get("costId"));

        Integer costID = Integer.parseInt((String) map.get("costId"));

        Service service = serviceService.findById(id);
        System.out.println(service);
        service.setCostId(costID);
        if (serviceService.update(service) == 0) {
            return AjaxResult.error("保存失败");
        }
        System.out.println(serviceService.findById(id));
        return AjaxResult.success("保存成功");
    }

    @PostMapping("/updateStatus")//serviceId
    public AjaxResult updateStatus(@RequestBody Map<String, Object> map) {
        System.out.println(map.get("serviceId"));
        Integer serviceID = Integer.parseInt((String) map.get("serviceId"));

        if (serviceService.updateStatus(serviceID) == 0) {
            return AjaxResult.error("更新状态失败");
        }
        return AjaxResult.success("更新状态成功");
    }

    @PostMapping("/delete")//serviceId
    public AjaxResult delete(@RequestBody Map<String, Object> map) {
        System.out.println(map.get("serviceId"));
        Integer serviceID = Integer.parseInt((String) map.get("serviceId"));

        if (serviceService.delete(serviceID) == 0) {
            return AjaxResult.error("删除失败");
        }
        return AjaxResult.success("删除成功");
    }

    @PostMapping("/add")
    public AjaxResult add(@RequestBody Map<String, Object> map) {

        if (serviceService.add(map) == 0) {
            return AjaxResult.error("保存失败");
        }
        return AjaxResult.success("保存成功");

    }

    @GetMapping("/getAccount")
    public AjaxResult findByIdCard(@RequestParam("idcardNo") String idcardNo) {
        Account account = accountService.findByIdCardNo(idcardNo);
        AjaxResult ajax = AjaxResult.success("success");
        if (account == null) {
            return AjaxResult.error("false");
        } else {
            Service service = serviceService.findById(account.getAccountId());
            Integer costId = service.getCostId();
            Cost cost = costService.findById(costId);
            ajax.put("account", account);
            ajax.put("service", service);
            ajax.put("cost", cost);
            return ajax;
        }
    }
}

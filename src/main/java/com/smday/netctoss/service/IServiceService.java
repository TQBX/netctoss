package com.smday.netctoss.service;

import com.smday.netctoss.mbg.model.Service;
import net.bytebuddy.agent.builder.AgentBuilder;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Summerday
 */
public interface IServiceService {

    /**
     * 查询所有
     * @return
     */
    List<Service> findList();


    List<Service> findListByExample(Map<String, Object> searchMap);

    List<Service> findPage(int page, int size);

    List<Service> findPageByExample(Map<String, Object> searchMap, int page, int size);

    Service findById(Integer id);

    int insert(Service service);

    int update(Service service);

    int updateStatus(Integer serviceID);

    int delete(Integer serviceID);
}

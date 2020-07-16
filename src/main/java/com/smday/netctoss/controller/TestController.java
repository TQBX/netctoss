package com.smday.netctoss.controller;

import com.smday.netctoss.mbg.model.Service;
import com.smday.netctoss.service.impl.ServiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Summerday
 */

@RestController
public class TestController {


    @Autowired
    ServiceServiceImpl serviceService;

    @GetMapping("/test")
    public String test(){

        Service byId = serviceService.findById(1);
        System.out.println(byId);
        byId.setCostId(10);
        int update = serviceService.update(byId);
        System.out.println(update);
        System.out.println(serviceService.findById(1));

        return "xxx";
    }
}

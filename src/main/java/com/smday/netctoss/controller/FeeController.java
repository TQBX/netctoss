package com.smday.netctoss.controller;

import com.smday.netctoss.common.AjaxResult;
import com.smday.netctoss.mbg.model.Cost;
import com.smday.netctoss.service.ICostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Summerday
 */

@RestController
@RequestMapping("/fee")
public class FeeController {

    @Autowired
    ICostService costService;

    @PostMapping(value = "/addFee",consumes = MediaType.APPLICATION_JSON_VALUE,produces = {"application/json;charset=UTF-8"})
    public AjaxResult addFee(@RequestBody Cost cost){
        if(costService.insert(cost)>0){
            return AjaxResult.success("新增成功");
        }else {
            return AjaxResult.error("新增失败");
        }
    }

}

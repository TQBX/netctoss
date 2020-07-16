package com.smday.netctoss.controller;

import com.smday.netctoss.common.AjaxResult;
import com.smday.netctoss.mbg.model.AdminInfo;
import com.smday.netctoss.service.IAdminInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Summerday
 */

@RestController
public class AdminController {

    @Autowired
    IAdminInfoService adminInfoService;

    @PostMapping("/login")
    public AjaxResult login(@RequestBody AdminInfo adminInfo) {

        //todo验证码校验

        AdminInfo info = adminInfoService.login(adminInfo);

        if (info == null) {
            return AjaxResult.error("登陆失败");
        }
        AjaxResult ajaxResult = AjaxResult.success("登录成功");
        ajaxResult.put("user", info);

        return ajaxResult;

    }

}

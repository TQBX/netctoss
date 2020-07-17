package com.smday.netctoss.controller;

import com.smday.netctoss.common.AjaxResult;
import com.smday.netctoss.common.StringUtils;
import com.smday.netctoss.mbg.model.AdminInfo;
import com.smday.netctoss.service.IAdminInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author Summerday
 */

@RestController
public class AdminController {

    @Autowired
    IAdminInfoService adminInfoService;

    @PostMapping("/login")
    public AjaxResult login(@RequestBody Map<String,String> map,
                            HttpServletRequest request) {

        String adminCode = map.get("adminCode");
        String password = map.get("password");
        String code = map.get("validateCode");

        HttpSession session = request.getSession();
        String verifyCode = (String)session.getAttribute("verifyCode");

        session.removeAttribute("verifyCode");

        if(!StringUtils.equalsIgnoreCase(verifyCode,code)){
            return AjaxResult.error("验证码不正确");
        }

        AdminInfo adminInfo = adminInfoService.selectAdminByAdminCode(adminCode);
        if(adminInfo == null){
            return AjaxResult.error("用户名不存在");
        }


        if(!StringUtils.equals(adminInfo.getPassword(),password)){
            return AjaxResult.error("密码错误");
        }
        AjaxResult ajaxResult = AjaxResult.success("登录成功");
        ajaxResult.put("user", adminInfo);

        return ajaxResult;

    }

}

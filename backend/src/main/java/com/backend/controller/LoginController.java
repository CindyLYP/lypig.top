package com.backend.controller;

import com.backend.pojo.User;
import com.backend.pojo.Result;
import com.backend.service.serviceImpl.loginServiceImpl;
import com.backend.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import com.backend.mapper.UserMapper;

@Controller
public class LoginController {

    @Autowired
    loginService loginService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User ResponseUser) {
        String name = ResponseUser.getUsername();
        String pwd = ResponseUser.getPassword();
        System.out.println("receive json from frontend");


        if (loginService.checkAccount(name, pwd)==1) {
            System.out.println("success");
            return new Result(200);
        }
        else {
            System.out.println("fail");
            return new Result(400);
        }
    }
}

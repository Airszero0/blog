package com.blog.web.controller;

import com.blog.login.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    IUserService userService;

    @ResponseBody
    @RequestMapping("/index")
    public String Index(){
        return userService.get("a").toString();
    }
}

package com.xu.producer2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class AccountController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){

        return  "端口：9994";
    }
}

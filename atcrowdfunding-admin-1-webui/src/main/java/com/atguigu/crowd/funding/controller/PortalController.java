package com.atguigu.crowd.funding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortalController {
    @RequestMapping("/index")
    public String testHu(){
        return "index-page";
    }
}

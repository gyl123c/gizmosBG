package com.gyl.bg.gizmos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "/index";
    }
    @RequestMapping("/testSocket")
    public String testSocket(){
        return "/socket/testSocket";
    }
}

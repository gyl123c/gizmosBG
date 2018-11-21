package com.gyl.bg.gizmos.controller;

import com.gyl.bg.gizmos.entity.InterfaceRsp;
import com.gyl.bg.gizmos.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String Hello(){
        return "hello!";
    }

    @RequestMapping("/getList")
    public InterfaceRsp getList(){
        List list = testService.getList();
        return (new InterfaceRsp()).success(list);
    }
}

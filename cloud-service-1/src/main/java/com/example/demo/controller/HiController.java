package com.example.demo.controller;


import com.example.common.entity.Result;
import com.example.common.entity.ResultCode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public Result home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        String data="hi " + name + " ,i am from port:" + port;
        return new Result(ResultCode.OK,data);
    }
}

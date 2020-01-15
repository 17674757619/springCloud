package com.example.demo.demo.controller;

import com.example.demo.common.entity.Result;
import com.example.demo.common.entity.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="HiController",tags={"测试接口接口"})
public class HiController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    @ApiOperation("更改用户信息")
    public Result home(@RequestParam(value = "name", defaultValue = "forezp") @ApiParam(name="用户name",value="传入String格式",required=true) String name) {
        String data="hi " + name + " ,i am from port:" + port;
        return new Result(ResultCode.REMTE_ERROR,data);
    }
}

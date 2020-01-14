package com.example.demo.demo.hystrix;

import com.example.demo.common.entity.Result;
import com.example.demo.common.entity.ResultCode;
import com.example.demo.demo.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class HiServiceHystrix implements SchedualServiceHi {
    //Hystrix熔断；报错返回
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}


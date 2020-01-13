package com.example.demo.hystrix;

import com.example.common.entity.Result;
import com.example.demo.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class HiServiceHystrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}


package com.example.demo.demo.hystrix;

import com.example.demo.demo.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class HiServiceHystrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}


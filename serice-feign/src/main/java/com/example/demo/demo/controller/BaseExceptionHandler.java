package com.example.demo.demo.controller;

import com.example.demo.common.entity.Result;
import com.example.demo.common.entity.ResultCode;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result exception (Exception e) {
        e.printStackTrace();
        System.out.println(e);
        return new Result(ResultCode.ERROR);
    }

}

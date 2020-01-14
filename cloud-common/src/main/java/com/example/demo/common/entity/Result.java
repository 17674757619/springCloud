package com.example.demo.common.entity;

public class Result {
    private boolean success;
    private Integer code;
    private String message;
    private Object data;


    public Result(ResultCode code){
        this.success=code.success;
        this.code=code.code;
        this.message=code.message;
    }


    public Result(ResultCode code,Object data){
        this.success=code.success;
        this.code=code.code;
        this.message=code.message;
        this.data=data;
    }

    public Result(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

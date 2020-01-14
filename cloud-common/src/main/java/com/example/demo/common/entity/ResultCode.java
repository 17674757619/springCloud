package com.example.demo.common.entity;

public enum ResultCode {
    OK(true,10000,"操作成功"),
    ERROR(false,10001,"操作失败"),
    ACCESS_ERROR(false,10002,"权限不足"),
    REMTE_ERROR(false,10002,"远程调用失败"),
    SERVER_ERROR(false,99999,"抱歉，系统繁忙，请稍后重试！");
   boolean success;
   int code;
   String message;

   ResultCode(boolean success,int code,String message){
       this.success=success;
       this.code=code;
       this.message=message;
   }
   public  boolean success(){
       return  success;
   }

   public int code(){
       return  code;
   }

   public String message(){
       return message;
   }
}

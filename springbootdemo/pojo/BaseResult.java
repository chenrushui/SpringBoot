package com.yunque.www.springbootdemo.pojo;

import lombok.Data;

@Data
public class BaseResult {
    public int code;
    public String message;
    public Object result;

}

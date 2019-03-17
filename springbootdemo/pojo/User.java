package com.yunque.www.springbootdemo.pojo;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//可以在主配置文件中进行统一的配置，值为null的进行统一过滤
public class User {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.yunque.www.springbootdemo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public class HelloService implements IHelloService {

    /**
     * 开启注解式事务
     *
     * @param id
     */
    @Transactional
    @Override
    public void getHelloData(Integer id) {

    }
}

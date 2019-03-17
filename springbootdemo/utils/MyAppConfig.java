package com.yunque.www.springbootdemo.utils;

import com.yunque.www.springbootdemo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    /**
     * 注意方法的名字
     *
     * @return
     */
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}

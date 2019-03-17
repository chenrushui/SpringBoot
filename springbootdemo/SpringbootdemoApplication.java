package com.yunque.www.springbootdemo;

import com.yunque.www.springbootdemo.aop.MyAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:bean.xml"})
@SpringBootApplication(scanBasePackages = "com.yunque.www")
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

    /**
     * 如果不注入到容器中，就不能发挥作用
     * @return
     */
    @Bean(name="myAspect")
    public MyAspect getMyAspect(){
        return new MyAspect();
    }
}

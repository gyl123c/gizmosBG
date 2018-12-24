package com.gyl.bg.gizmos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan(value = "com.gyl.bg.gizmos.dao")
@SpringBootApplication
public class GizmosApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(GizmosApplication.class, args);
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for(String name:beanDefinitionNames){
//            System.out.println("===>"+name);
//        }
    }
}

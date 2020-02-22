package com.atguigu.crowd.funding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.atguigu.crowd.funding.mapper")
@EnableSwagger2
@EnableAsync
public class AtApp {
    public static void main(String[] args) {
    		SpringApplication.run(AtApp.class, args);
    	}
}

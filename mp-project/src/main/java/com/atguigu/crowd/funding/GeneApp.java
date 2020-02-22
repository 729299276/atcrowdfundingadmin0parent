package com.atguigu.crowd.funding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication

public class GeneApp {
    public static void main(String[] args) {
    		SpringApplication.run(GeneApp.class, args);
    	}
}

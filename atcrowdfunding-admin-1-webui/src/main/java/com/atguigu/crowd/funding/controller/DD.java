package com.atguigu.crowd.funding.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class DD {
    @Async
    public void syss(){

        System.out.println("异步执行方法");
        int i =1/0;
    }
}

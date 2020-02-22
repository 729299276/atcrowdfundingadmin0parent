package com.atguigu.crowd.funding.configer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class ExpectionGlb {
    @ExceptionHandler(value =RuntimeException.class)
    public String exceptionHandler(Exception e){
        System.out.println("未知异常！原因是:"+e);
        log.error("未知异常:{}"+e.getMessage());
        log.info("555555");
        return "system-error";
    }
}

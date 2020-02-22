package com.atguigu.crowd.funding.controller;


import com.atguigu.crowd.funding.service.TRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tian
 * @since 2020-02-17
 */
@Controller

public class TRoleController {
    @Autowired
    private TRoleService tRoleService;
    @RequestMapping("role/query/for/search")
    public String showrole(@RequestParam(value ="pageNum",defaultValue = "1") Integer page,
                           @RequestParam(value = "pageSize",defaultValue = "10") Integer size,
                           @RequestParam("keyword") String key, Model model){
        System.out.println("**********/role/query/for/search");
return null;

    }
}


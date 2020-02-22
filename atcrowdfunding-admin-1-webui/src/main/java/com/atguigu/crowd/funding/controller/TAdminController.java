package com.atguigu.crowd.funding.controller;


import com.atguigu.crowd.funding.entity.ResultEntity;
import com.atguigu.crowd.funding.entity.TAdmin;
import com.atguigu.crowd.funding.service.TAdminService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tian
 * @since 2020-02-14
 */
@Controller
public class TAdminController {
    @Autowired
    private TAdminService tAdminService;
    @Autowired
    private DD dd;
    //显示登陆页面
    @ApiOperation(value = "显示登陆页面")
    @RequestMapping("/admin/to/login/page")
    @ResponseBody
    public String testHu(){
        System.out.println("进入请求方法");
        tAdminService.getByName("111");

        System.out.println("结束请求方法");
        return "admin-login";
    }

    //处理登陆业务
    @RequestMapping("/admin/do/login")
    public  String dologin(@RequestParam("loginAcct") String loginAcct,
                           @RequestParam("userPswd") String userPswd,
                           HttpSession session, Model model){

        TAdmin tAdmin = tAdminService.getByName(loginAcct);
        String pwd = tAdmin.getUserpswd();
        if(!userPswd.equals(pwd)){
            //密码不正确
            model.addAttribute("MESSAGE","登录账号或密码不正确！请核对后再登录！");
            return "admin-login";
        }
        session.setAttribute("LOGIN-ADMIN",tAdmin);
        return "admin-main";
    }

    //。
    @RequestMapping("/admin/query/for/search")
    public String selectByKey(@RequestParam(value ="pageNum",defaultValue = "1") Integer page,
                              @RequestParam(value = "pageSize",defaultValue = "10") Integer size,
                              @RequestParam("keyword") String key,Model model){
        System.out.println("**********/admin/query/for/search");
       PageInfo<TAdmin> pageInfo = tAdminService.selectByKey(page, size, key);
       model.addAttribute("PAGE-INFO",pageInfo);
        return "admin-page";
    }
    @ResponseBody
    @PostMapping("/admin/batch/remove")
    public ResultEntity deleteByChose(@RequestBody List<Integer> lists){
        try {
            tAdminService.removeByIds(lists);
            return ResultEntity.successWithoutData("删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultEntity.failed(null,"失败");
        }
    }
    @GetMapping("/admin/add")
    public  String toadd(){
        return "admin-add";
    }
    @PostMapping("/admin/save")
    public String saveUser( TAdmin tAdmin){
        boolean b = tAdminService.saveOrUpdate(tAdmin);
        if(b){
            System.out.println("添加成功！！");
            return "redirect:/admin/add";
        }
        System.out.println("添加失败！！");
        return "redirect:/admin/add";
    }

}


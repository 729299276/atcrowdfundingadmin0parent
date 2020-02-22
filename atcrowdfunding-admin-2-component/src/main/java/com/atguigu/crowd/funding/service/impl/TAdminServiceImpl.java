package com.atguigu.crowd.funding.service.impl;

import com.atguigu.crowd.funding.entity.TAdmin;
import com.atguigu.crowd.funding.mapper.TAdminMapper;
import com.atguigu.crowd.funding.service.TAdminService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tian
 * @since 2020-02-14
 */
@Service
public class TAdminServiceImpl extends ServiceImpl<TAdminMapper, TAdmin> implements TAdminService {
    @Autowired
    private TAdminMapper tAdminMapper;
    public TAdmin getByName(String name){
        QueryWrapper qw = new QueryWrapper();
        qw.eq("username",name);
        TAdmin tAdmin = tAdminMapper.selectOne(qw);
        System.out.println("tAdmin{}数据："+tAdmin);
        return tAdmin;
    }
    //根据关键字分页查询
    @Override
    public PageInfo<TAdmin> selectByKey(Integer page, Integer size, String keyword) {
        PageHelper.startPage(page,size);
        List<TAdmin> admins = tAdminMapper.selectAdminByKey(keyword);
        PageInfo<TAdmin> pageInfo = new PageInfo<>(admins);
        return pageInfo;
    }

}

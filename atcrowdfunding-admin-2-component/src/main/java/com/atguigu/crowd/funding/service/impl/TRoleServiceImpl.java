package com.atguigu.crowd.funding.service.impl;

import com.atguigu.crowd.funding.entity.TRole;
import com.atguigu.crowd.funding.mapper.TRoleMapper;
import com.atguigu.crowd.funding.service.TRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tian
 * @since 2020-02-17
 */
@Service
public class TRoleServiceImpl extends ServiceImpl<TRoleMapper, TRole> implements TRoleService {
    private TRoleMapper tRoleMapper;

    @Override
    public PageInfo<TRole> getRolePage(Integer page, Integer size, String key) {
        PageHelper.startPage(page,size);

        return null;
    }
}

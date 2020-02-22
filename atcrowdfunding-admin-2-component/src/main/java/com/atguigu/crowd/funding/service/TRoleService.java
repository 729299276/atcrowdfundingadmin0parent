package com.atguigu.crowd.funding.service;

import com.atguigu.crowd.funding.entity.TRole;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tian
 * @since 2020-02-17
 */
public interface TRoleService extends IService<TRole> {
    PageInfo<TRole> getRolePage(Integer page,Integer size,String key);
}

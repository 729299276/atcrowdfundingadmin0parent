package com.atguigu.crowd.funding.mapper;

import com.atguigu.crowd.funding.entity.TRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tian
 * @since 2020-02-17
 */
public interface TRoleMapper extends BaseMapper<TRole> {
    List<TRole> getRoleByKey(String keyword);
}

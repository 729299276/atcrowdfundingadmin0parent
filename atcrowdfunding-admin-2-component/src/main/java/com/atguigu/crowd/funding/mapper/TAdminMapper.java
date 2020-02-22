package com.atguigu.crowd.funding.mapper;

import com.atguigu.crowd.funding.entity.TAdmin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tian
 * @since 2020-02-14
 */
public interface TAdminMapper extends BaseMapper<TAdmin> {
    List<TAdmin> selectAdminByKey(String keyword);
}

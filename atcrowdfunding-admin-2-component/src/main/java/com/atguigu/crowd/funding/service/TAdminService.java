package com.atguigu.crowd.funding.service;

import com.atguigu.crowd.funding.entity.TAdmin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tian
 * @since 2020-02-14
 */
public interface TAdminService extends IService<TAdmin> {
      public TAdmin getByName(Integer id);
      PageInfo<TAdmin> selectByKey(Integer page,Integer size,String keyword);
}

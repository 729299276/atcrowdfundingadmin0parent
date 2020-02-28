package com.atguigu.crowd.funding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author tian
 * @since 2020-02-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TAdmin对象", description="")
public class TAdmin implements Serializable {



    private Integer id;
   @XStreamAlias("loginacct")
    private String loginacct;
@XStreamAlias("userpswd")
    @ApiModelProperty(value = "密码")
    private String userpswd;

    private String username;

    private String email;

    private String createtime;
    private List<TRole> roles;


}

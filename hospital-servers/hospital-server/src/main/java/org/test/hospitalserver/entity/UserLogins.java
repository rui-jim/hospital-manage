package org.test.hospitalserver.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
@Data
public class UserLogins implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户登录的ID
     */
    @TableId(value = "u_id", type = IdType.AUTO)
    private Integer uId;

    /**
     * 用户登录的账号[电话，邮箱]
     */
    @TableField("account")
    private String account;
    
    @TableField("name")
    private String name;
    
    /**
     * 用户登录的密码
     */
    @TableField("password")
    private String password;
    /**
     * 用户的电话号码
     */
    @TableField("phone")
    private String phone;

    /**
     * 用户的邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;

    /**
     * 登录时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")//页面写入数据库时格式化
    @JsonFormat(pattern="yyyy-MM-dd")//从数据库读出日期格式时，进行转换的规则
    @TableField(value="login_time",fill=FieldFill.INSERT)
    private Date loginTime;

    /**
     * 用户登录的密码
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")//页面写入数据库时格式化
    @JsonFormat(pattern="yyyy-MM-dd")//从数据库读出日期格式时，进行转换的规则
    @TableField(value="gmt_time",fill= FieldFill.INSERT)
    private Date gmtTime;
    
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")//页面写入数据库时格式化
    @JsonFormat(pattern="yyyy-MM-dd")//从数据库读出日期格式时，进行转换的规则
    @TableField(value="create_time",fill= FieldFill.INSERT)
    private Date createTime;


}

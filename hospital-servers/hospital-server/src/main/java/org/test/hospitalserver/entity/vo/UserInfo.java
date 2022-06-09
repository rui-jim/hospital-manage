package org.test.hospitalserver.entity.vo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class UserInfo {
    
    private Integer uId;
    
    private String account;
    
    private String name;
    
    private DoctorsVo jobInfo;
    
    private RolesVo role;
    
    private String password;
    
    private String phone;
    
    private String email;
    
    private Integer isDelete;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")//页面写入数据库时格式化
    @JsonFormat(pattern="yyyy-MM-dd")//从数据库读出日期格式时，进行转换的规则
    @TableField(value="login_time",fill= FieldFill.INSERT)
    private Date loginTime;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")//页面写入数据库时格式化
    @JsonFormat(pattern="yyyy-MM-dd")//从数据库读出日期格式时，进行转换的规则
    @TableField(value="gmt_time",fill= FieldFill.INSERT)
    private Date gmtTime;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")//页面写入数据库时格式化
    @JsonFormat(pattern="yyyy-MM-dd")//从数据库读出日期格式时，进行转换的规则
    @TableField(value="create_time",fill= FieldFill.INSERT)
    private Date createTime;
    
}

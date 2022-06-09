package org.test.hospitalserver.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.test.hospitalserver.entity.Doctors;
import org.test.hospitalserver.entity.UserLogins;

import java.util.Date;
import java.util.List;

@Data
public class AccountsVo {
    
    private static final long serialVersionUID = 1L;

    private Integer uId;
    private String account;
    private String password;
    private String phone;
    private String name;
    private String email;
    private List<RolesVo> rolesVo;
    
    @TableField("login_time")
    @JsonFormat(pattern="yyyy-MM-dd")//从数据库读出日期格式时，进行转换的规则
    private Date loginTime;
    @TableField("create_time")
    @JsonFormat(pattern="yyyy-MM-dd")//从数据库读出日期格式时，进行转换的规则
    private Date createTime;
    @TableField("gmt_time")
    @JsonFormat(pattern="yyyy-MM-dd")//从数据库读出日期格式时，进行转换的规则
    private String gmtTime;
    
    public static UserLogins convertToUserLogins(AccountsVo accountsVo){
        UserLogins userLogins = new UserLogins();
        BeanUtils.copyProperties(accountsVo,userLogins);
        return userLogins;
    }
}

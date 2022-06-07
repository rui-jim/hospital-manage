package org.test.hospitalserver2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author my
 * @since 2022-05-16
 */
public class UserLogins implements Serializable {

    private static final long serialVersionUID = 1L;

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

    /**
     * 用户登录的密码
     */
    @TableField("password")
    private String password;

    /**
     * 医生ID
     */
    @TableField("d_id")
    private Integer dId;

    /**
     * 病人ID
     */
    @TableField("p_id")
    private Integer pId;

    /**
     * 管理员ID
     */
    @TableField("a_id")
    private Integer aId;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;

    /**
     * 登录时间
     */
    @TableField("login_time")
    private Date loginTime;

    /**
     * 修改时间
     */
    @TableField("gmt_time")
    private Date gmtTime;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getGmtTime() {
        return gmtTime;
    }

    public void setGmtTime(Date gmtTime) {
        this.gmtTime = gmtTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserLogins{" +
        "uId=" + uId +
        ", account=" + account +
        ", password=" + password +
        ", dId=" + dId +
        ", pId=" + pId +
        ", aId=" + aId +
        ", isDelete=" + isDelete +
        ", loginTime=" + loginTime +
        ", gmtTime=" + gmtTime +
        ", createTime=" + createTime +
        "}";
    }
}

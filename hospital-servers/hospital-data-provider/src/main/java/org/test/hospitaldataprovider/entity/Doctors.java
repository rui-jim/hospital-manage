package org.test.hospitaldataprovider.entity;

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
 * @since 2022-04-30
 */
public class Doctors implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 医生ID
     */
    @TableId(value = "d_id", type = IdType.AUTO)
    private Integer dId;

    /**
     * 医生名字
     */
    @TableField("d_name")
    private String dName;

    /**
     * 医生年龄
     */
    @TableField("d_age")
    private Integer dAge;

    /**
     * 医生头像
     */
    @TableField("d_avatar")
    private String dAvatar;

    /**
     * 医生身份证
     */
    @TableField("d_identified")
    private String dIdentified;

    /**
     * 医生学历
     */
    @TableField("d_degree")
    private String dDegree;

    /**
     * 医生住址
     */
    @TableField("d_address")
    private String dAddress;

    /**
     * 入职时间
     */
    @TableField("d_entry_time")
    private Date dEntryTime;

    /**
     * 离职时间
     */
    @TableField("d_resign_time")
    private Date dResignTime;

    /**
     * 挂诊费用
     */
    @TableField("d_out_register")
    private Integer dOutRegister;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;

    /**
     * 角色id
     */
    @TableField("r_id")
    private Integer rId;


    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Integer getdAge() {
        return dAge;
    }

    public void setdAge(Integer dAge) {
        this.dAge = dAge;
    }

    public String getdAvatar() {
        return dAvatar;
    }

    public void setdAvatar(String dAvatar) {
        this.dAvatar = dAvatar;
    }

    public String getdIdentified() {
        return dIdentified;
    }

    public void setdIdentified(String dIdentified) {
        this.dIdentified = dIdentified;
    }

    public String getdDegree() {
        return dDegree;
    }

    public void setdDegree(String dDegree) {
        this.dDegree = dDegree;
    }

    public String getdAddress() {
        return dAddress;
    }

    public void setdAddress(String dAddress) {
        this.dAddress = dAddress;
    }

    public Date getdEntryTime() {
        return dEntryTime;
    }

    public void setdEntryTime(Date dEntryTime) {
        this.dEntryTime = dEntryTime;
    }

    public Date getdResignTime() {
        return dResignTime;
    }

    public void setdResignTime(Date dResignTime) {
        this.dResignTime = dResignTime;
    }

    public Integer getdOutRegister() {
        return dOutRegister;
    }

    public void setdOutRegister(Integer dOutRegister) {
        this.dOutRegister = dOutRegister;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    @Override
    public String toString() {
        return "Doctors{" +
        "dId=" + dId +
        ", dName=" + dName +
        ", dAge=" + dAge +
        ", dAvatar=" + dAvatar +
        ", dIdentified=" + dIdentified +
        ", dDegree=" + dDegree +
        ", dAddress=" + dAddress +
        ", dEntryTime=" + dEntryTime +
        ", dResignTime=" + dResignTime +
        ", dOutRegister=" + dOutRegister +
        ", isDelete=" + isDelete +
        ", rId=" + rId +
        "}";
    }
}

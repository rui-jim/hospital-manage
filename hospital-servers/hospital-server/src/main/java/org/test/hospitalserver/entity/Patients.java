package org.test.hospitalserver.entity;

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
 * @since 2022-04-16
 */
public class Patients implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 病人ID
     */
    @TableId(value = "p_id", type = IdType.AUTO)
    private Integer pId;

    /**
     * 病人名字
     */
    @TableField("p_name")
    private String pName;

    /**
     * 病人年龄
     */
    @TableField("p_age")
    private Integer pAge;

    /**
     * 病人头像
     */
    @TableField("p_avatar")
    private String pAvatar;

    /**
     * 病人身份证
     */
    @TableField("p_identified")
    private String pIdentified;

    /**
     * 病人住址
     */
    @TableField("p_address")
    private String pAddress;

    /**
     * 病情ID
     */
    @TableField("p_c_id")
    private Integer pCId;

    /**
     * 入院时间
     */
    @TableField("p_entry_time")
    private Date pEntryTime;

    /**
     * 离离时间
     */
    @TableField("p_resign_time")
    private Date pResignTime;

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


    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getpAge() {
        return pAge;
    }

    public void setpAge(Integer pAge) {
        this.pAge = pAge;
    }

    public String getpAvatar() {
        return pAvatar;
    }

    public void setpAvatar(String pAvatar) {
        this.pAvatar = pAvatar;
    }

    public String getpIdentified() {
        return pIdentified;
    }

    public void setpIdentified(String pIdentified) {
        this.pIdentified = pIdentified;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    public Integer getpCId() {
        return pCId;
    }

    public void setpCId(Integer pCId) {
        this.pCId = pCId;
    }

    public Date getpEntryTime() {
        return pEntryTime;
    }

    public void setpEntryTime(Date pEntryTime) {
        this.pEntryTime = pEntryTime;
    }

    public Date getpResignTime() {
        return pResignTime;
    }

    public void setpResignTime(Date pResignTime) {
        this.pResignTime = pResignTime;
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
        return "Patients{" +
        "pId=" + pId +
        ", pName=" + pName +
        ", pAge=" + pAge +
        ", pAvatar=" + pAvatar +
        ", pIdentified=" + pIdentified +
        ", pAddress=" + pAddress +
        ", pCId=" + pCId +
        ", pEntryTime=" + pEntryTime +
        ", pResignTime=" + pResignTime +
        ", isDelete=" + isDelete +
        ", rId=" + rId +
        "}";
    }
}

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
public class DoctorsPatients implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 医生id
     */
    @TableField("d_id")
    private Integer dId;

    /**
     * 病人id
     */
    @TableField("p_id")
    private Integer pId;

    /**
     * 治疗病情id
     */
    @TableField("p_c_id")
    private Integer pCId;

    /**
     * 治疗地点
     */
    @TableField("treat_address")
    private String treatAddress;

    /**
     * 治疗操作
     */
    @TableField("treat_manage")
    private String treatManage;

    /**
     * 治疗时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;


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

    public Integer getpCId() {
        return pCId;
    }

    public void setpCId(Integer pCId) {
        this.pCId = pCId;
    }

    public String getTreatAddress() {
        return treatAddress;
    }

    public void setTreatAddress(String treatAddress) {
        this.treatAddress = treatAddress;
    }

    public String getTreatManage() {
        return treatManage;
    }

    public void setTreatManage(String treatManage) {
        this.treatManage = treatManage;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "DoctorsPatients{" +
        "dId=" + dId +
        ", pId=" + pId +
        ", pCId=" + pCId +
        ", treatAddress=" + treatAddress +
        ", treatManage=" + treatManage +
        ", createTime=" + createTime +
        ", isDelete=" + isDelete +
        "}";
    }
}

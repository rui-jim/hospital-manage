package org.test.hospitalserver2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class PatientCase implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 病情ID
     */
    @TableField("p_c_id")
    private Integer pCId;

    /**
     * 病情名称
     */
    @TableField("p_c_name")
    private String pCName;

    /**
     * 病人ID
     */
    @TableField("p_id")
    private Integer pId;

    /**
     * 医生ID
     */
    @TableField("d_id")
    private Integer dId;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;


    public Integer getpCId() {
        return pCId;
    }

    public void setpCId(Integer pCId) {
        this.pCId = pCId;
    }

    public String getpCName() {
        return pCName;
    }

    public void setpCName(String pCName) {
        this.pCName = pCName;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "PatientCase{" +
        "pCId=" + pCId +
        ", pCName=" + pCName +
        ", pId=" + pId +
        ", dId=" + dId +
        ", isDelete=" + isDelete +
        "}";
    }
}

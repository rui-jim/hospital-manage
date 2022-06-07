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
public class PrescriptionDoctors implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 病人id
     */
    @TableField("p_id")
    private Integer pId;

    /**
     * 药品id
     */
    @TableField("m_id")
    private Integer mId;

    /**
     * 药品数量
     */
    @TableField("number")
    private Integer number;

    /**
     * 医生id
     */
    @TableField("d_id")
    private Integer dId;


    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return "PrescriptionDoctors{" +
        "pId=" + pId +
        ", mId=" + mId +
        ", number=" + number +
        ", dId=" + dId +
        "}";
    }
}

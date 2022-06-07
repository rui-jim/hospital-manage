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
public class PatientCaseMedicines implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 病情ID
     */
    @TableField("p_c_id")
    private Integer pCId;

    /**
     * 药品ID
     */
    @TableField("m_id")
    private Integer mId;

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

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "PatientCaseMedicines{" +
        "pCId=" + pCId +
        ", mId=" + mId +
        ", isDelete=" + isDelete +
        "}";
    }
}

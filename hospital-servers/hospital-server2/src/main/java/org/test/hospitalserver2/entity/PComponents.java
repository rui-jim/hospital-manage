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
public class PComponents implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("p_id")
    private Integer pId;

    /**
     * 组件ID
     */
    @TableField("c_id")
    private Integer cId;


    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    @Override
    public String toString() {
        return "PComponents{" +
        "pId=" + pId +
        ", cId=" + cId +
        "}";
    }
}

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
public class RolesPermissions implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("p_id")
    private Integer pId;

    @TableField("r_id")
    private Integer rId;


    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    @Override
    public String toString() {
        return "RolesPermissions{" +
        "pId=" + pId +
        ", rId=" + rId +
        "}";
    }
}

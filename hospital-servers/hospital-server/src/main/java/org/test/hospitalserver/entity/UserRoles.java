package org.test.hospitalserver.entity;

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
 * @since 2022-04-19
 */
public class UserRoles implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员id
     */
    @TableField("a_id")
    private Integer aId;

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
     * 角色id
     */
    @TableField("r_id")
    private Integer rId;


    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
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

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    @Override
    public String toString() {
        return "UserRoles{" +
        "aId=" + aId +
        ", dId=" + dId +
        ", pId=" + pId +
        ", rId=" + rId +
        "}";
    }
}

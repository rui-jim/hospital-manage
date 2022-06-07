package org.test.hospitalserver.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
@Data
public class Doctors implements Serializable {

    private static final long serialVersionUID=1L;

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
    
    private String scGraduation;
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
    @TableField(value="d_entry_time",fill=FieldFill.INSERT)
    private Date dEntryTime;

    /**
     * 离职时间
     */
    @TableField(value="d_resign_time")
    private Date dResignTime;

    @TableField(value="mod_time")
    private Date modTime;
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


}

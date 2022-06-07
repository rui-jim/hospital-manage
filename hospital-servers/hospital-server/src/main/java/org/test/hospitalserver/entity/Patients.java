package org.test.hospitalserver.entity;

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
     * 医生ID
     */
    @TableField("p_d_id")
    private Integer pDId;
    
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

    @TableField(value="mod_time")
    private Date modTime;
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

package org.test.hospitaldataprovider.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class DoctorsVo {

    private static final long serialVersionUID = 1L;

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
    @TableField("d_entry_time")
    private Date dEntryTime;

    /**
     * 离职时间
     */
    @TableField("d_resign_time")
    private Date dResignTime;

    /**
     * 挂诊费用
     */
    @TableField("d_out_register")
    private Integer dOutRegister;


}

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
public class Doctors implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 医生ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 医生名字
     */
    @TableField("name")
    private String name;

    /**
     * 医生年龄
     */
    @TableField("age")
    private Integer age;

    /**
     * 挂诊费用
     */
    @TableField("out_register")
    private Integer outRegister;

    /**
     * 所属部门名字
     */
    @TableField("dept_id")
    private Integer deptId;

    /**
     * 角色id
     */
    @TableField("r_id")
    private Integer rId;

    /**
     * 最后一次修改时间
     */
    @TableField("mod_time")
    private Date modTime;

    /**
     * 医生头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 医生介绍
     */
    @TableField("intro")
    private String intro;

    private String scGraduation;
    /**
     * 所获奖项
     */
    @TableField("award")
    private String award;

    /**
     * 医生身份证
     */
    @TableField("identified")
    private String identified;

    /**
     * 医生学历
     */
    @TableField("degree")
    private String degree;

    /**
     * 医生住址
     */
    @TableField("address")
    private String address;

    /**
     * 月薪
     */
    @TableField("salary")
    private Integer salary;

    /**
     * 入职时间
     */
    @TableField("entry_time")
    private Date entryTime;

    /**
     * 离职时间
     */
    @TableField("resign_time")
    private Date resignTime;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;


   
}

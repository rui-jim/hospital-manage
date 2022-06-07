package org.test.hospitalserver2.entity;

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
 * @since 2022-05-16
 */
@Data
public class Nurses implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 护士id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 护士名字
     */
    @TableField("name")
    private String name;

    /**
     * 护士年龄
     */
    @TableField("age")
    private Integer age;
    private String scGraduation;
    /**
     * 部门id
     */
    @TableField("dept_id")
    private Integer deptId;

    /**
     * 角色id
     */
    @TableField("r_id")
    private Integer rId;

    /**
     * 护士学历
     */
    @TableField("degree")
    private String degree;

    /**
     * 护士头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 护士介绍
     */
    @TableField("intro")
    private String intro;

    /**
     * 所获奖项
     */
    @TableField("award")
    private String award;

    /**
     * 护士身份证
     */
    @TableField("identified")
    private String identified;

    /**
     * 护士住址
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

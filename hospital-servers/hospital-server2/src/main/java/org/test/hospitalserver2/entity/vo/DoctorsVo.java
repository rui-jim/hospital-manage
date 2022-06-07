package org.test.hospitalserver2.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.test.hospitalserver2.entity.Depts;
import org.test.hospitalserver2.entity.Doctors;
import org.test.hospitalserver2.entity.Roles;

import java.util.Date;

@Data
public class DoctorsVo {

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
    
    private Roles roles;

    private Depts depts;
    private String scGraduation;
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



    public static Doctors convertToDoctors(DoctorsVo doctorsVo){
        Doctors doctors = new Doctors();
        BeanUtils.copyProperties(doctorsVo,doctors);
        return doctors;
    }
    
    public static DoctorsVo convertToDoctorsVo(Doctors doctors){
        DoctorsVo doctorsVo = new DoctorsVo();
        BeanUtils.copyProperties(doctors,doctorsVo);
        return doctorsVo;
    }
}

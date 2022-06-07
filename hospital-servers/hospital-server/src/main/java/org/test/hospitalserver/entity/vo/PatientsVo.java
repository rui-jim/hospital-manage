package org.test.hospitalserver.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.test.hospitalserver.entity.Doctors;
import org.test.hospitalserver.entity.Medicines;
import org.test.hospitalserver.entity.PatientCase;
import org.test.hospitalserver.entity.Patients;

import javax.print.Doc;
import java.util.Date;
import java.util.List;

@Data
public class PatientsVo {

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
     * 医生ID
     */
//    @TableField("p_d_id")
//    private Integer pDId;
    private List<String> doctorsName;
    /**
     * 角色id
     */
//    @TableField("r_id")
//    private Integer rId;
    private RolesVo rolesVo;
    
    private List<PatientCase> patientCases;
    
    private List<Medicines> medicines;


    public static Patients convertToPatients(PatientsVo patientsVo){
        Patients patients = new Patients();
        BeanUtils.copyProperties(patientsVo,patients);
        return patients;
    }

    public static PatientsVo convertToPatientsVo(Patients patients){
        PatientsVo patientsVo = new PatientsVo();
        BeanUtils.copyProperties(patients,patientsVo);
        return patientsVo;
    }
    
}

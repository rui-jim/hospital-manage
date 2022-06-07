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
public class Patients implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 病人ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 病人名字
     */
    @TableField("name")
    private String name;

    /**
     * 病人年龄
     */
    @TableField("age")
    private Integer age;

    /**
     * 关联的医生ID
     */
    @TableField("d_id")
    private Integer dId;

    /**
     * 病情ID
     */
    @TableField("c_id")
    private Integer cId;

    /**
     * 病人头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 病人身份证
     */
    @TableField("identified")
    private String identified;

    /**
     * 病人住址
     */
    @TableField("address")
    private String address;

    /**
     * 入院时间
     */
    @TableField("entry_time")
    private Date entryTime;

    /**
     * 离院时间
     */
    @TableField("resign_time")
    private Date resignTime;

    /**
     * 最后一次修改时间
     */
    @TableField("mod_time")
    private Date modTime;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getIdentified() {
        return identified;
    }

    public void setIdentified(String identified) {
        this.identified = identified;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getResignTime() {
        return resignTime;
    }

    public void setResignTime(Date resignTime) {
        this.resignTime = resignTime;
    }

    public Date getModTime() {
        return modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Patients{" +
        "id=" + id +
        ", name=" + name +
        ", age=" + age +
        ", dId=" + dId +
        ", cId=" + cId +
        ", avatar=" + avatar +
        ", identified=" + identified +
        ", address=" + address +
        ", entryTime=" + entryTime +
        ", resignTime=" + resignTime +
        ", modTime=" + modTime +
        ", isDelete=" + isDelete +
        "}";
    }
}

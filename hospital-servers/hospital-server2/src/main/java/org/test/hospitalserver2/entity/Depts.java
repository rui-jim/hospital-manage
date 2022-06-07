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
public class Depts implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 部门名
     */
    @TableField("name")
    private String name;

    /**
     * 部门所在地址
     */
    @TableField("address")
    private String address;

    /**
     * 部门创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 部门修改的时间
     */
    @TableField("mod_time")
    private Date modTime;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModTime() {
        return modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    @Override
    public String toString() {
        return "Depts{" +
        "id=" + id +
        ", name=" + name +
        ", address=" + address +
        ", createTime=" + createTime +
        ", modTime=" + modTime +
        "}";
    }
}

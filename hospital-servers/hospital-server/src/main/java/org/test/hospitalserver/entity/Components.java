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
 * @since 2022-04-16
 */
public class Components implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 组件ID
     */
    @TableId(value = "c_id", type = IdType.AUTO)
    private Integer cId;

    /**
     * 组件路径
     */
    @TableField("path")
    private String path;

    /**
     * 组件名称
     */
    @TableField("name")
    private String name;

    /**
     * 访问名称
     */
    @TableField("title")
    private String title;

    /**
     * 父组件ID
     */
    @TableField("p_id")
    private Integer pId;

    /**
     * 是否展示,0为false
     */
    @TableField("hidden")
    private String hidden;


    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getHidden() {
        return hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    @Override
    public String toString() {
        return "Components{" +
        "cId=" + cId +
        ", path=" + path +
        ", name=" + name +
        ", title=" + title +
        ", pId=" + pId +
        ", hidden=" + hidden +
        "}";
    }
}

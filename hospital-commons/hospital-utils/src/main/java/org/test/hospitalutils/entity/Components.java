package org.test.hospitalutils.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author my
 * @since 2022-05-16
 */
@Data
public class Components implements Serializable {

    private static final long serialVersionUID = 1L;

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
    
    private String component;
    /**
     * 是否展示,0为false
     */
    @TableField("hidden")
    private String hidden;
    
}

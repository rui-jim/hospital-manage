package org.test.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Admins implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "a_id", type = IdType.AUTO)
    private Integer aId;

    @TableField("name")
    private String name;

    @TableField("age")
    private Integer age;

    /**
     * 角色id
     */
    @TableField("r_id")
    private Integer rId;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;
    
}

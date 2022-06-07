package org.test.hospitalutils.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.ibatis.type.Alias;

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
@Alias("permissions")
public class Permissions implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 权限ID
     */
    @TableId(value = "p_id", type = IdType.AUTO)
    private Integer pId;

    @TableId(value = "p_nickname", type = IdType.AUTO)
    private String pNickname;
    /**
     * 权限名称
     */
    @TableField("p_name")
    private String pName;

    /**
     * 组件ID
     */
    private String component;
    @TableField("c_id")
    private Integer cId;
    
}

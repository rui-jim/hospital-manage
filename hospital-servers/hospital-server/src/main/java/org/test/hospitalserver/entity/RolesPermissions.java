package org.test.hospitalserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@AllArgsConstructor
@NoArgsConstructor
public class RolesPermissions implements Serializable {

    private static final long serialVersionUID=1L;
    
    @TableId(value = "p_id")
    private Integer pId;

    @TableId(value = "r_id")
    private Integer rId;

    
}

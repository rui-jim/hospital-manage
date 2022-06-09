package org.test.hospitalserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * @since 2022-04-19
 */
@Data
public class UserRoles implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 用户id
     */
    @TableField("u_id")
    private Integer uId;
    /**
     * 角色id
     */
    @TableField("r_id")
    private Integer rId;


}

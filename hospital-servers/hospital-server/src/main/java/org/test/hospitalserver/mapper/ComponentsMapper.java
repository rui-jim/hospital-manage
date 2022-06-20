package org.test.hospitalserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.test.hospitalserver.entity.vo.MenuVo;
import org.test.hospitalutils.entity.Components;

import java.awt.*;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
public interface ComponentsMapper extends BaseMapper<Components> {
    @Select("select c_id,path,name,title,component,hidden,p_id\n" +
            "from components\n" +
            "where c_id in(\n" +
            "\tselect DISTINCT c_id\n" +
            "\tfrom permissions p inner join roles_permissions r_p on p.p_id = r_p.p_id\n" +
            "\twhere r_p.r_id in (\n" +
            "\t\tselect r_id\n" +
            "\t\tfrom user_logins logins inner join user_roles u_r on logins.u_id=u_r.u_id\n" +
            "\t\twhere logins.account='user'\n" +
            "\t)\n" +
            ") or p_id is null\n" +
            "order by p_id")
    List<Components> getMenu(@Param("account") String account);
    

    List<Integer> getCid(@Param("account") String account );
}

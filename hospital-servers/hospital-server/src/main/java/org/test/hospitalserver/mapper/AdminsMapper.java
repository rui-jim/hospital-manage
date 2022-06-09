package org.test.hospitalserver.mapper;

import org.apache.ibatis.annotations.Param;
import org.test.hospitalserver.entity.Admins;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.test.hospitalserver.entity.vo.AccountsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
public interface AdminsMapper extends BaseMapper<Admins> {

    Admins getAdmins();
    
    List<AccountsVo> getUserAccountsVo();

    List<AccountsVo> getAccountsVoInfo(@Param("uId") Integer uId);
    
    
}

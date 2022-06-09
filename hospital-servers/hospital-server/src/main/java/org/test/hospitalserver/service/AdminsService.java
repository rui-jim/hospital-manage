package org.test.hospitalserver.service;

import org.test.hospitalserver.entity.Admins;
import com.baomidou.mybatisplus.extension.service.IService;
import org.test.hospitalserver.entity.vo.AccountsVo;
import org.test.hospitalutils.utils.R;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
public interface AdminsService extends IService<Admins> {

    List<AccountsVo> getAccountsList();


    R updateAccountsInfo(AccountsVo accountsVo);

    R deleteAcount(Integer uid);
}

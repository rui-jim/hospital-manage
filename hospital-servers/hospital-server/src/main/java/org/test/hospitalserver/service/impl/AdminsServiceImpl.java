package org.test.hospitalserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.test.hospitallogging.annotation.ModelAnonymous;
import org.test.hospitalserver.entity.Admins;
import org.test.hospitalserver.entity.Roles;
import org.test.hospitalserver.entity.UserLogins;
import org.test.hospitalserver.entity.UserRoles;
import org.test.hospitalserver.entity.vo.AccountsVo;
import org.test.hospitalserver.entity.vo.RolesVo;
import org.test.hospitalserver.mapper.AdminsMapper;
import org.test.hospitalserver.mapper.UserRolesMapper;
import org.test.hospitalserver.service.AdminsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.test.hospitalserver.service.UserLoginsService;
import org.test.hospitalserver.service.UserRolesService;
import org.test.hospitalutils.utils.R;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
@Service
@Slf4j
public class AdminsServiceImpl extends ServiceImpl<AdminsMapper, Admins> implements AdminsService {

    @Autowired
    UserLoginsService userLoginsService;
    
    @Autowired
    UserRolesService userRolesService;
    
    @Autowired
    UserRolesMapper userRolesMapper;
    
    @Autowired
    AdminsMapper adminsMapper;
    
    @ModelAnonymous()
    @Override
    public List<AccountsVo> getAccountsList() {
        List<AccountsVo> userAccountsVo = adminsMapper.getUserAccountsVo();
        return userAccountsVo;
    }

    @ModelAnonymous()
    @Override
    public R updateAccountsInfo(AccountsVo accountsVo) {
        try {
            if(accountsVo.getUId()==null){
                return insertAccounts(accountsVo);
            }else{
                return updateAccounts(accountsVo);
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error().data("resInfo","加入的数据出错");
        }
    }

    @ModelAnonymous()
    @Override
    public R deleteAcount(Integer uid) {
        
        try {
            R res = deleteUserLogins(uid);
            return res;
        }catch (Exception e){
            e.printStackTrace();
            return R.error().data("resInfo","删除出祸了");
        }
    }

    
    @Transactional(rollbackFor = Exception.class)
    public R deleteUserLogins(Integer uid) {
        QueryWrapper<UserLogins> userLoginsQW = new QueryWrapper<>();
        QueryWrapper<UserRoles> userRolesQW = new QueryWrapper<>();
        userLoginsQW.eq("u_id",uid);
        userRolesQW.eq("u_id",uid);
        boolean remove1 = userLoginsService.remove(userLoginsQW);
        boolean remove2 = userRolesService.remove(userRolesQW);
        if(remove1 && remove2){
            return R.ok().data("resInfo","删除成功");
        }
        return R.error().data("resInfo","删除失败");
    }


    @Transactional(rollbackFor=Exception.class)
    public R insertAccounts(AccountsVo accountsVo){
        
        UserLogins userLogins = AccountsVo.convertToUserLogins(accountsVo);
        boolean save = userLoginsService.save(userLogins);
        int i = userRolesMapper.insertURbyAccount(userLogins.getUId(), accountsVo.getRolesVo().get(0).getRId());
        if(i==1 && save) {
            return R.ok().data("resInfo", "账户增加成功");
        }else{
            return R.error().data("resInfo","账户增加失败了");
        }
    }
    
    @Transactional(rollbackFor=Exception.class)
    public R updateAccounts(AccountsVo accountsVo){
        UserLogins userLogins = AccountsVo.convertToUserLogins(accountsVo);
        QueryWrapper<UserLogins> userLoginsQW = new QueryWrapper<>();
        userLoginsQW.eq("u_id",userLogins.getUId());
        boolean update = userLoginsService.update(userLogins, userLoginsQW);

        QueryWrapper<UserRoles> userRolesQW = new QueryWrapper<>();
        userRolesQW.eq("u_id", userLogins.getUId());
        UserRoles userRoles = new UserRoles();
        boolean judge = false;
        //将Roles进行转换成Role修改
        for(RolesVo temp:accountsVo.getRolesVo()){
            BeanUtils.copyProperties(temp,userRoles);
            judge=userRolesService.update(userRoles, userRolesQW);
            if(!judge || !update){
                return R.error().data("resInfo","账户修改失败");
            }
        }
        return R.ok().data("resInfo","账户修改成功");
    }


}

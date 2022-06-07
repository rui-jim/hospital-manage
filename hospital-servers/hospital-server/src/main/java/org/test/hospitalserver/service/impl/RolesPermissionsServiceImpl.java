package org.test.hospitalserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.test.hospitalserver.entity.Roles;
import org.test.hospitalserver.entity.RolesPermissions;
import org.test.hospitalserver.entity.vo.RolesVo;
import org.test.hospitalserver.mapper.RolesPermissionsMapper;
import org.test.hospitalserver.service.RolesPermissionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.test.hospitalutils.entity.Permissions;

import java.util.ArrayList;
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
public class RolesPermissionsServiceImpl extends ServiceImpl<RolesPermissionsMapper, RolesPermissions> implements RolesPermissionsService {

    @Autowired
    RolesPermissionsService rolesPermissionsService;
    
    @Override
    public Boolean updatePerOfRole(RolesVo rolesVo) {
        QueryWrapper<RolesPermissions> qw = new QueryWrapper<>();
        qw.eq("r_id",rolesVo.getRId());
        List<RolesPermissions> list = this.baseMapper.selectList(qw);
        Map<String,Object> updateMap = commonPer(rolesVo,list);
        boolean judge=false;
        try {
            judge = updateDB(updateMap, qw);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
//        rolesPermissionsService
        return judge;
    }

    @Transactional(rollbackFor = Exception.class)
    public boolean updateDB(Map<String,Object> updateMap, QueryWrapper<RolesPermissions> qw){
        QueryWrapper<RolesPermissions> deleteQW = new QueryWrapper<>();
        
        List<RolesPermissions> add = (List<RolesPermissions>) updateMap.get("add");
        List<Integer> del = (List<Integer>) updateMap.get("del");
        if(!add.isEmpty()){
            for (RolesPermissions tempAdd : add) {
                rolesPermissionsService.save(tempAdd);
            }
        }else if(!del.isEmpty()){
            deleteQW.in("p_id",del);
            rolesPermissionsService.remove(deleteQW);
        }
        return true;
    }
    
    private Map<String,Object> commonPer(RolesVo rolesVo, List<RolesPermissions> dbList) {
        Map<String, Object> res = new HashMap<>();
        List<Permissions> permissionsList = rolesVo.getPermissionsList();

        RolesPermissions temp = null;
        List<RolesPermissions> common = new ArrayList<>();
        
        for (int i = 0; i < dbList.size(); i++) {
            temp = dbList.get(i);
            for (int j = 0; j < permissionsList.size(); j++) {
                if(temp.getPId()==permissionsList.get(j).getPId()){
                    common.add(temp);
                }
            }
        }
        log.info("common {}",common);
        res.put("add",addPermissions(permissionsList, rolesVo.getRId(), common));
        res.put("del",deletePermissions(dbList,common));
        
        return res;
    }
    
    public  List<RolesPermissions> addPermissions(List<Permissions> permissionsList,Integer rId,List<RolesPermissions> common){
        int count = permissionsList.size();
        List<RolesPermissions> addPer = new ArrayList<>();
        //存储备份permissionsList
        List<Permissions> backup = clonePerList(permissionsList);
        Permissions p = null;
        RolesPermissions rP = null;
        
        for (int i = 0 ; i < count;i++) {
            p = backup.get(i); 
            backup.add(p);
            for ( int j=0;j<common.size();j++) {
                rP=common.get(j);
                if (p.getPId() == rP.getPId()) {
                    //将相同的部分删除
                    permissionsList.set(i,null);
                    break;
                }
            }
        }
        for (Permissions tempP : permissionsList) {
            if(tempP!=null) {
                addPer.add(new RolesPermissions(tempP.getPId(), rId));
            }
        }
        //还原permissionsList
        permissionsList = backup;
        log.info("addPer = {}",addPer);
        return addPer;
    }


    public List<Integer> deletePermissions(List<RolesPermissions> dbList,List<RolesPermissions> common){
        List<Integer> delPer = new ArrayList<>();
        List<RolesPermissions> backup = cloneRolesPerList(dbList);
        RolesPermissions rP1 = null;
        RolesPermissions rP2 = null;

        int count=dbList.size();
        for (int i = 0 ; i < count;i++) {
            rP1 = backup.get(i);
            backup.add(rP1);
            for ( int j=0;j<common.size();j++) {
                rP2=common.get(j);
                if (rP1.getPId() == rP2.getPId()) {
                    //将相同的部分删除
                    dbList.set(i,null);
                    break;
                }
            }
        }
        for (RolesPermissions rp : dbList) {
            if(rp!=null) {
                delPer.add(rp.getPId());
            }
        }
        //dbList
        dbList = backup;
        log.info("delPer = {}",delPer);
        return delPer;
    }

    private List<RolesPermissions> cloneRolesPerList(List<RolesPermissions> dbList) {
        ArrayList<RolesPermissions> backup = new ArrayList<>();
        for (RolesPermissions rolesPermissions :
                dbList) {
            RolesPermissions temp = new RolesPermissions();
            temp.setPId(rolesPermissions.getPId());
            backup.add(temp);
        }
        return backup;
    }

    private List<Permissions> clonePerList(List<Permissions> permissionsList) {
        ArrayList<Permissions> backup = new ArrayList<>();
        for (Permissions permissions :
                permissionsList) {
            Permissions temp = new Permissions();
            temp.setPId(permissions.getPId());
            backup.add(temp);
        }
        return backup;
    }
}

package org.test.hospitalserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.test.hospitalserver.entity.Admins;
import org.test.hospitalserver.entity.Roles;
import org.test.hospitalserver.mapper.AdminsMapper;
import org.test.hospitalserver.mapper.RolesMapper;

import java.util.List;

@SpringBootTest
public class HospitalServerApplicationTests {

    @Autowired
    AdminsMapper adminsMapper;
    
    @Autowired
    RolesMapper rolesMapper;
    
    @Test
    public void test2(){
        Admins admins = adminsMapper.getAdmins();
        System.out.println(admins);
    }
    
    @Test
    void test(){
        List<Roles> roles = rolesMapper.getRoles();
        
//        List<RoPrProperties> roPrProperties = rolesMapper.getRoPrProperties(200);
//        System.out.println(roPrProperties);
    }
}

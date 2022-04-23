/**
 * Copyright (C) 2018-2020
 * All rights reserved, Designed By www.yixiang.co
 * 注意：
 * 本软件为www.yixiang.co开发研制
 */
package org.test.hospitalsecurity.conf;


import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;
import org.test.hospitalsecurity.utils.SecurityUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Zheng Jie
 */
@Slf4j
@Service(value = "elp")
public class ElPermissionConfig {

    public Boolean check(String... permissions) {
        // 获取当前用户的所有权限
        List<String> elPermissions = SecurityUtils.getLoginUser().getPermissionList();
        // 判断当前用户的所有权限是否包含接口上定义的权限
        log.info("elper=========. {}",elPermissions);
        boolean result = elPermissions.contains("admin") || Arrays.stream(permissions).anyMatch(elPermissions::contains);
        System.out.println("result============>"+result);
        return result;
    }
}

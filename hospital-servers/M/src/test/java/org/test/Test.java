package org.test;


import org.apache.ibatis.session.SqlSession;
import org.test.entity.Roles;
import org.test.mapper.TestMapper;
import org.test.utils.MybatisUtil;

import java.util.List;

public class Test {
    @org.junit.Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        TestMapper userDao = sqlSession.getMapper(TestMapper.class);

        List<Roles> roles = userDao.getRoles();

        sqlSession.close();

    }
    
    
}

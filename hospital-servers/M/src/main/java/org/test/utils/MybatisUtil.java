package org.test.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {

    static SqlSessionFactory sqlSessionFactory = null;

    static {
        //使用Mybatis第一步 ：获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
//            int temp = 1;
//            byte[] bytes = new byte[1024];
//            while((temp=inputStream.read(bytes))!=-1){
//                System.out.println(new String(bytes,0,bytes.length));
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        InputStream inputStream = MybatisUtil.class.getClassLoader().getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    //既然有了 SqlSessionFactory，顾名思义，我们可以从中获得 SqlSession 的实例.
    // SqlSession 提供了在数据库执行 SQL 命令所需的所有方法。
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }


}

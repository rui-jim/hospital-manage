package org.test.hospitalconfig.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DataMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("dResignTime", new Date(), metaObject);
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("modTime", new Date(), metaObject);
        this.setFieldValByName("gmtTime", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("gmtTime", new Date(), metaObject);
        this.setFieldValByName("modTime", new Date(), metaObject);
        this.setFieldValByName("createTime", new Date(), metaObject);
    }
}

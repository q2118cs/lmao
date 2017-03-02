package com.cool.service.impl;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.cool.dao.BaseDao;
import com.cool.domain.AbstractEntity;
import com.cool.service.BaseService;
import org.springframework.util.Assert;

/**
 * Created by 孙瑞 on 2017/2/20.
 */
public abstract class BaseServiceImpl<T extends AbstractEntity> implements BaseService<T> {

    protected abstract BaseDao<T, String> getDao();

    protected Class<T> entityClazz;

    public BaseServiceImpl() {
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        entityClazz = (Class<T>) params[0];
    }


    @Override
    public T findOne(String id) {
        Assert.notNull(id);
        return getDao().selectByPrimaryKey(id);
    }
}

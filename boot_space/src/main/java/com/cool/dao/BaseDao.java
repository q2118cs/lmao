package com.cool.dao;

import java.io.Serializable;

/**
 * Created by 孙瑞 on 2017/2/20.
 */
public interface BaseDao<T extends Serializable, Id extends Serializable> {

    int deleteByPrimaryKey(Id id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Id id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);



}

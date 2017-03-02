package com.cool.service;

import java.io.Serializable;

/**
 * Created by 孙瑞 on 2017/2/20.
 */
public interface BaseService<T extends Serializable> {

    T findOne(String id);

}

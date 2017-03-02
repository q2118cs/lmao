package com.cool.service;

import com.cool.domain.WebUser;

/**
 * Created by 孙瑞 on 2017/2/20.
 */
public interface WebUserService extends BaseService<WebUser> {

    WebUser findOneById(String Id);
}

package com.cool.service.impl;

import com.cool.dao.BaseDao;
import com.cool.dao.WebUserMapper;
import com.cool.domain.WebUser;
import com.cool.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 孙瑞 on 2017/2/20.
 */
public class WebUserServiceImpl extends BaseServiceImpl<WebUser>
        implements WebUserService {

    @Autowired
    private WebUserMapper userDao;

    public WebUser findOneById(String Id) {
        return getDao().selectByPrimaryKey(Id);
    }


    @Override
    protected BaseDao<WebUser, String> getDao() {
        return userDao;
    }
}

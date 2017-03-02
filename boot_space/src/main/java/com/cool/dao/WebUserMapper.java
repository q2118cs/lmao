package com.cool.dao;


import com.cool.domain.WebUser;

public interface WebUserMapper extends BaseDao<WebUser, String> {
    int deleteByPrimaryKey(Integer id);

    int insert(WebUser record);

    int insertSelective(WebUser record);

    WebUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebUser record);

    int updateByPrimaryKey(WebUser record);


}
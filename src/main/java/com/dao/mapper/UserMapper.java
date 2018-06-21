package com.dao.mapper;

import com.bean.User;

/**
 * Created by Administrator on 2018/1/7 0007.
 */
public interface UserMapper {
    User getUser(int id);
    User getUserByNamePasswd(String name,String passwd);
    User getUserByName(String name);
}

package com.service;

import com.bean.User;
import com.dao.mapper.UserDao;

public class UserServer {

    //获取用户信息
    public User getUserByName(String name){
        User user=new UserDao().getUserByName(name);
        return user;
    }

}

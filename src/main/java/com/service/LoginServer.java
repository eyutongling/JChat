package com.service;

import com.bean.User;
import com.dao.mapper.UserDao;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class LoginServer {

    //登录
    public boolean login(String name,String passwd){
        User user=new UserDao().getUserByNamePasswd(name,passwd);
        if (user!=null){
            return true;
        }
        return false;
    }

}

package com.control;

import com.service.LoginServer;
import com.view.Success;
import com.view.indexView;
import com.view.loginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
public class LoginControl {

    public static void main(String[] args) {

        loginView loginView=new loginView();
        LoginServer loginServer=new LoginServer();
        loginView.getLogin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username=loginView.getUser().getText();
                String passwd=loginView.getPasswd().getText();
                System.out.println(username);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        if (loginServer.login(username,passwd)){
                            //把indexview和username传给indexcontroller
                            new IndexControl(new indexView(),username);
                            loginView.dispose();
                            System.out.println(username);
                        }
                        else {
                            new Success("登录失败！");
                        }
                    }
                }).start();
            }
        });
        //回车键发送
        loginView.getPasswd().addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyChar()==KeyEvent.VK_ENTER )   //按回车键执行相应操作;
                {
                    loginView.getLogin().doClick();
                }
            }
        });
    }
}

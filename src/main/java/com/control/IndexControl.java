package com.control;

import com.service.LoginServer;
import com.service.RecServer;
import com.service.SendServer;
import com.view.indexView;
import com.view.loginView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.Socket;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
public class IndexControl {


    private Socket socket;
    IndexControl(indexView indexView,String username){


        try {
            socket=new Socket("127.0.0.1",4000);
            System.out.println("success");
            new RecServer(socket,indexView).start();

        } catch (Exception e) {
            e.printStackTrace();
        }

        indexView.getjButtonSend().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String news=indexView.getjTextField().getText();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        if (news.length()!=0){
                            System.out.println(news);
                            new SendServer(socket,username+"："+news).start();
                            indexView.getjTextField().setText("");
                        }
                    }
                }).start();
            }
        });
        //回车键发送
        indexView.getjTextField().addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyChar()==KeyEvent.VK_ENTER )   //按回车键执行相应操作;
                {
                    indexView.getjButtonSend().doClick();
                }
            }
        });
    }

}

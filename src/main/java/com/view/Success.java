package com.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/9 0009.
 */
public class Success extends JFrame {

    private JLabel jLabel;
    public Success(String news){
        jLabel=new JLabel(news);

        this.setLayout(new FlowLayout());
        this.setSize(300,185);
        this.setLocationRelativeTo(null);

        this.add(jLabel);
        this.setVisible(true);
    }
}

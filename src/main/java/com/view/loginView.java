package com.view;

import javax.swing.*;
import java.awt.*;

/**
 * 登录界面
 */
public class loginView extends JFrame {
	//内容
	private JPanel jPanel;
	private JLabel userName;
	private JLabel passWord;
	private JTextField user;
	private JTextField passwd;
	private JButton regist;
	private JButton login;

	public loginView(){
		jPanel =new JPanel();
		userName=new JLabel("用户名");
		passWord=new JLabel("密码");
		regist=new JButton("注册");
		login=new JButton("登录");
		user=new JTextField();
		passwd=new JTextField();

		this.setLayout(null);
		this.setSize(380, 638);
		this.setResizable(false);

		jPanel.setSize(380,638);
		jPanel.setLayout(null);
		jPanel.setBackground(Color.green);

		userName.setBounds(50,150,60,35);
		user.setBounds(110,150,180,35);
		passWord.setBounds(50,200,60,35);
		passwd.setBounds(110,200,180,35);
		regist.setBounds(50,250,110,35);
		login.setBounds(180,250,110,35);
		this.add(jPanel);


		jPanel.add(userName);
		jPanel.add(user);
		jPanel.add(passWord);
		jPanel.add(passwd);
		jPanel.add(regist);
		jPanel.add(login);

		this.setVisible(true);
	}

	public JPanel getjPanel() {
		return jPanel;
	}

	public void setjPanel(JPanel jPanel) {
		this.jPanel = jPanel;
	}

	public JLabel getUserName() {
		return userName;
	}

	public void setUserName(JLabel userName) {
		this.userName = userName;
	}

	public JLabel getPassWord() {
		return passWord;
	}

	public void setPassWord(JLabel passWord) {
		this.passWord = passWord;
	}

	public JTextField getUser() {
		return user;
	}

	public void setUser(JTextField user) {
		this.user = user;
	}

	public JTextField getPasswd() {
		return passwd;
	}

	public void setPasswd(JTextField passwd) {
		this.passwd = passwd;
	}

	public JButton getRegist() {
		return regist;
	}

	public void setRegist(JButton regist) {
		this.regist = regist;
	}

	public JButton getLogin() {
		return login;
	}

	public void setLogin(JButton login) {
		this.login = login;
	}
}

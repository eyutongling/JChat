package com.view;

import javax.swing.*;
import java.awt.*;

/**
 * 聊天界面
 */
public class indexView extends JFrame {
	//内容
	private JPanel jPanel;
	private JLabel userMessage;
	private JLabel jLabel;
	//java列表
	private JScrollPane jScrollPane;
	private DefaultListModel defaultListModel;
	private JList jList;
	//发送
	private JPanel jPanelsend;
	private JTextField jTextField;
	private JButton jButtonSend;

	//phone
	private JPanel jPanelPhone;
	private Graphics graphics;



	public indexView(){
		jPanel =new JPanel();
		userMessage=new JLabel();
		jLabel =new JLabel();
		jPanelsend =new JPanel();
		jTextField =new JTextField();
		jButtonSend =new JButton("发送");
		jScrollPane=new JScrollPane();
		defaultListModel=new DefaultListModel();
		jList=new JList();
		jPanelPhone=new JPanel();

		this.setLayout(null);
		this.setSize(380, 638);
		this.setResizable(false);

		jPanel.setSize(380,480);
		jPanel.setLayout(null);
		jPanel.setBackground(Color.green);


			jScrollPane.setSize(380,480);
			jScrollPane.setBackground(Color.pink);
			userMessage.setSize(380,40);
			userMessage.setText("机器人：欢迎来到黑洞聊天");
			jLabel=new JLabel();jLabel.setSize(370,40);// jLabel.setText(" luan 加入聊天室");

			defaultListModel.addElement(userMessage.getText());
			defaultListModel.addElement(jLabel.getText());
			jList.setModel(defaultListModel);
			jList.setFont(new Font("微软雅黑",Font.PLAIN,18));
			jScrollPane.setViewportView(jList);
		jPanelsend.setBounds(0,488,380,40);
		jPanelsend.setLayout(null);
		jPanelsend.setBackground(Color.pink);

			jTextField.setBounds(0,0,300,40);
			jButtonSend.setBounds(305,0,70,40);

		jPanelPhone.setBackground(Color.green);
		jPanelPhone.setLayout(null);
		jPanelPhone.setBounds(0,521,380,116);


		//add
		jPanel.add(jScrollPane);
		jPanel.add(jLabel);
		jPanelsend.add(jTextField);
		jPanelsend.add(jButtonSend);

		this.add(jPanel);
		this.add(jPanelsend);
		this.add(jPanelPhone);


		this.setVisible(true);
	}

	public JPanel getjPanel() {
		return jPanel;
	}

	public void setjPanel(JPanel jPanel) {
		this.jPanel = jPanel;
	}

	public JLabel getjLabel() {
		return jLabel;
	}

	public void setjLabel(JLabel jLabel) {
		this.jLabel = jLabel;
	}

	public JTextField getjTextField() {
		return jTextField;
	}

	public void setjTextField(JTextField jTextField) {
		this.jTextField = jTextField;
	}

	public JLabel getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(JLabel userMessage) {
		this.userMessage = userMessage;
	}
	public JScrollPane getjScrollPane() {
		return jScrollPane;
	}

	public void setjScrollPane(JScrollPane jScrollPane) {
		this.jScrollPane = jScrollPane;
	}

	public DefaultListModel getDefaultListModel() {
		return defaultListModel;
	}

	public void setDefaultListModel(DefaultListModel defaultListModel) {
		this.defaultListModel = defaultListModel;
	}

	public JList getjList() {
		return jList;
	}

	public void setjList(JList jList) {
		this.jList = jList;
	}

	public JPanel getjPanelsend() {
		return jPanelsend;
	}

	public void setjPanelsend(JPanel jPanelsend) {
		this.jPanelsend = jPanelsend;
	}

	public JButton getjButtonSend() {
		return jButtonSend;
	}

	public void setjButtonSend(JButton jButtonSend) {
		this.jButtonSend = jButtonSend;
	}
}

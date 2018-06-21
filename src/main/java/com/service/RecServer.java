package com.service;

import javax.swing.*;
import java.io.BufferedReader;
import java.net.Socket;

import com.view.indexView;

public class RecServer extends Thread {
	private Socket socket;
	private indexView index;

	public RecServer(Socket socket, indexView index){
		this.socket=socket;
		this.index=index;
	}
	@Override
	public void run() {
		try {

			IChatService chatServer;
			
			while (true) {

				chatServer=new ChatServer();
				String news=chatServer.getBufferedReader(socket.getInputStream()).readLine();
				if (!news.equals("\r\n")) {
					System.out.println(socket.getInetAddress().getHostAddress()+":"+news);
					index.getDefaultListModel().addElement(news);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

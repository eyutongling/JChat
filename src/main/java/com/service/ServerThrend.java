package com.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;

/**
 * 新建线程监听每一个客户端的消息
 */
public class ServerThrend extends Thread {
	private Socket socket;
	private ArrayList<Socket>sockets;
	private IChatService chatServer;
	PrintStream printStream;
	public ServerThrend(Socket socket,ArrayList<Socket>sockets) {
		this.socket=socket;
		this.sockets=sockets;
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				//读取客户端数据
				chatServer=new ChatServer();
				BufferedReader bufferedReader;
				bufferedReader=chatServer.getBufferedReader(socket.getInputStream());
				String string=bufferedReader.readLine();
				System.out.println("server："+string);
				//新建线程，把数据分发到所有客户端
				new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							for (Socket socket : sockets) {
								printStream=new PrintStream(socket.getOutputStream());

								printStream.println(string);
							}
						}catch (Exception e){
							e.printStackTrace();
						}
					}
				}).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

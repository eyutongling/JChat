package com.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SendServer extends Thread {
	private Socket socket;
	private String news;
	private PrintStream printStream;
	public SendServer(Socket socket,String news){
		this.socket=socket;
		this.news=news;
	}
	@Override
	public void run() {
		try {
		//发送消息给服务端
		printStream=new PrintStream(socket.getOutputStream());
		printStream.println(news);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com;


import java.net.ServerSocket;
import java.net.Socket;


import java.util.ArrayList;


import com.service.ServerThrend;

public class SRunner {
	
	private static ArrayList<Socket> sockets=new ArrayList<Socket>();
	public static void main(String[] args) {	
		try {
			//新建socketserver监听端口
			ServerSocket serverSocket=new ServerSocket(4000);
			System.out.println("wait for Connect.....");
			while (true) {
				//阻塞方法，有客户端连接进来就创建
				Socket socket=serverSocket.accept();
				System.out.println("success");
				sockets.add(socket);
				new ServerThrend(socket, sockets).start();
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

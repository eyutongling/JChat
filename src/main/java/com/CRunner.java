package com;

import java.awt.*;
import java.net.Socket;


import javax.swing.*;

import com.service.RecServer;
import com.service.SendServer;
import com.view.indexView;

public class CRunner {

	public static void main(String[] args) {
		
		try {
			Socket socket=new Socket("127.0.0.1",4000);
			System.out.println("success");

			indexView indexView=new indexView();
			new SendServer(socket,"test").start();
			new RecServer(socket,indexView).start();


		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

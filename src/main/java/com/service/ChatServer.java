package com.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ChatServer implements IChatService {

	@Override
	public BufferedReader getBufferedReader(InputStream inputStream) {		
		return new BufferedReader(new InputStreamReader(inputStream));
	}
}

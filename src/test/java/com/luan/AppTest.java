package com.luan;

import org.junit.Test;
import org.springframework.stereotype.Component;

import java.util.Scanner;

public class AppTest {
	
	@Test
	public void f(){
		Scanner scanner=new Scanner(System.in);
		double a=scanner.nextDouble()*0.3;
		double b=scanner.nextDouble()*0.4;
		double c=scanner.nextDouble()*0.3;
		System.out.println(a+" "+b+" "+c);
	}
}

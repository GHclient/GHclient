package dao;

import java.util.Scanner;

public class Userinput {
	public String getString(String msg){
		System.out.println(msg);
		Scanner sc=new Scanner(System.in);
		return sc.next();
	}
	public int getInt(String msg){
		System.out.println(msg);
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
	public double getDouble(String msg){
		System.out.println(msg);
		Scanner sc=new Scanner(System.in);
		return sc.nextDouble();
	}
}

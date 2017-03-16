package com.appdirect.exception;
import java.util.Scanner;
public class Except1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int res=x/y;
	System.out.println("Result="+res);
	System.out.println("Application Completed");
}
	
}

package com.appdirect.exception;

import java.io.File;
import java.io.FileInputStream;

public class ReadInput {
public static void main(String args[])
{ 
	try
	{
		FileInputStream fin=new FileInputStream("src/test.txt");
	  int i=0;
	 // System.out.println(fin.getName());
	  while((i=fin.read())!=-1)
	  {
		  System.out.print((char)i);
	  }
	  fin.close();	}catch(Exception e)
	{
		
	}
}
}

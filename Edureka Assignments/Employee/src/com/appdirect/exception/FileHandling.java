package com.appdirect.exception;

import java.io.FileOutputStream;

public class FileHandling  {
	public static void main(String args[]){
		
	
try{
		FileOutputStream fo=new FileOutputStream("src/test.txt");
 String str="Welcome to java file handling";
  byte[] b=str.getBytes();
fo.write(b);
fo.close();
System.out.println("Success");
}catch(Exception e)
{
	System.out.println(e);
}

}
}

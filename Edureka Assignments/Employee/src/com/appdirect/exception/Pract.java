package com.appdirect.exception;

import java.io.FileWriter;

public class Pract {
public static void main(String args[])throws Exception
{  
	try
	{
		FileWriter fw=new FileWriter("src/test1.txt");
	    fw.write("ahskdakusdjsadbfjkfhajbfhajfbhjabfh");
	    fw.close();
	}
	catch(Exception e)
	{
		System.out.print(e);
	}
}

	}

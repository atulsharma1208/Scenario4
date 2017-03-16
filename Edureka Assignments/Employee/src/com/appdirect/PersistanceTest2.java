package com.appdirect;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PersistanceTest2 {
	public static void main(String args[])throws Exception
	{
		FileInputStream fis=new FileInputStream("src/employee.txt");
	//to read object we need obj i/p stream
		ObjectInputStream o=new ObjectInputStream(fis);
	Object obj=o.readObject();
	Employee e=(Employee)obj;
	System.out.println(e);//it will call the object of super class java.lang.object and display the hash code in hexa form
	o.close();
	}

}

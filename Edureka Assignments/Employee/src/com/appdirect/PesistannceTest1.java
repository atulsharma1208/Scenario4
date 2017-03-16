package com.appdirect;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PesistannceTest1 {
public static void main(String args[])throws Exception
{
	Employee emp=new Employee(101,"Sagar Alias",123.45);
FileOutputStream fos=new FileOutputStream("src/employee.txt");
ObjectOutputStream o=new ObjectOutputStream(fos);
o.writeObject(emp);
o.close();
System.out.println("Employee saved");

}

}

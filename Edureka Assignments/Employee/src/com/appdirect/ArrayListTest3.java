package com.appdirect;

import java.util.ArrayList;
class Student 
{ int id;
String name;
 double sal;
	  
	Student(int id,String name,double sal )
	{
		this.id=id;
				this.name=name;
				this.sal=sal;
	}
}

public class ArrayListTest3 {

	public void main(String args[])
	{
		ArrayList<Student> emp=new ArrayList<Student>();
		Student emp1=new Student(101,"Abc",123.45);
		Student emp2=new Student(102,"Def",323.45);
		Student emp3=new Student(103,"Ghi",423.45);
		
		
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		System.out.println(emp);
		
	}
	
}

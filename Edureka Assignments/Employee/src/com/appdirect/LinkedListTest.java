package com.appdirect;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String args[])
	{
		LinkedList<String> names=new LinkedList<>();
	 names.add("Abc");
	 names.add("Def");
	 names.add("Ghi");
	 names.add("Jkl");
	 System.out.println(names);
	 names.addFirst("Rahul");
	 names.add("Prod");
	 System.out.println(names);
	 
	 Iterator <String> it=names.iterator();
	 while(it.hasNext())
	 { String name=it.next();
	 System.out.print(name+" , ");
		 
	 }
	 System.out.println();
	}

}

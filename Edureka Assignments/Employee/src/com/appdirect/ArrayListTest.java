package com.appdirect;

import java.util.ArrayList;

public class ArrayListTest {
public static void main(String args[])
{ ArrayList<String> a1=new ArrayList<String>();
System.out.println(a1+"\tSize= "+a1.size());
	a1.add("Achintya");
	a1.add("Aditya");
	a1.add("Abc");
	System.out.println(a1+"\tSize="+a1.size());
   //wants Abc at index 0
	a1.add(0,"Def");
	System.out.println(a1+"\tSize="+a1.size());
	 //wants to replace 
	a1.set(3, "Ghi");
	System.out.println(a1+"\tSize="+a1.size());
  	   }
}

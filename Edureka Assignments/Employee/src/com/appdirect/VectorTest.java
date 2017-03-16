package com.appdirect;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
public static void main(String args[])
{
//	Vector <Integer> v=new Vector<Integer>();
//	Vector <Integer> v=new Vector<Integer>(5);
	Vector <Integer> v=new Vector<Integer>(5,3);
	
	System.out.println("Size="+v.size()+"\t Capacity="+v.capacity());
	for(int i=10;i<20;i++)
	{
		v.add(i);
	}
System.out.println(v);
System.out.println("Size="+v.size()+"\t Capacity="+v.capacity());
v.add(21);
v.add(22);

System.out.println("Size="+v.size()+"\t Capacity="+v.capacity());

Enumeration <Integer> en=v.elements();
while(en.hasMoreElements())
{
	System.out.print(en.nextElement()+" ,");
}
}
}

package com.appdirect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest2 {
	public static void main(String args[])
	{
ArrayList<Integer> a1=new ArrayList<>();
for(int i=11;i<=16;i++)
{
	a1.add(i);
}
System.out.println(a1+" ");
//a1.Retrieving data tecnhiques
	//Tech-1
for(int i=0;i<a1.size();i++)
{
	System.out.print(a1.get(i)+"\t");
}
System.out.println();
//	Thread.sleep(1000);
//Tech-2 using extended for loop
for(int x:a1)
{
	System.out.print(x+"\t");
}

System.out.println();
//
//Tech-3:Using Iterator data from first to last
Iterator<Integer> it=a1.iterator();
while(it.hasNext())
{ Integer in=it.next();
System.out.print(in+"\t");
	
}
System.out.println();
	//YTech-4 List Iterator we can iterate data also in reverse order
ListIterator<Integer> lit=a1.listIterator();
	while(lit.hasNext())
	{ Integer in =lit.next();
		System.out.print(in+"\t");
	}
	System.out.println();
	while(lit.hasPrevious())
	{ Integer in=lit.previous();
	System.out.print(in+"\t");
		
	}
	System.out.println();
	//tech-5 :using enum
	Enumeration<Integer> en=Collections.enumeration(a1);
	while(en.hasMoreElements())
	{
		int n=en.nextElement();
		System.out.print(n+"\t");
	}
	}
}
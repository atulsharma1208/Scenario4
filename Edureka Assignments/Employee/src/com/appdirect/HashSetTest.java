package com.appdirect;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

public static void main(String args[])
{
	HashSet<String> courses=new HashSet<>();
	courses.add("C");
	courses.add("CPP");
	courses.add("Java");
	courses.add("Android");
	courses.add("iphone");
	courses.add("Hadoop");
	courses.add("Java");
	courses.add(null);

    System.out.println("No of courses= "+courses.size());
    System.out.println(courses);
    
    Iterator<String> it =courses.iterator();
    while(it.hasNext())
    {
    	String course=it.next();
    	System.out.println(course);
    }
}
}

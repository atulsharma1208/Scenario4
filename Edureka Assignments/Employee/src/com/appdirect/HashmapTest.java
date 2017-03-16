package com.appdirect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapTest {
public static void main(String args[])
{
	HashMap<String,Double> acc=new HashMap<String,Double>();
	acc.put("Abc", 1500.30);
	acc.put("Def", 1500.30);
	acc.put("Ghi", 1233500.30);
	acc.put("Jkl", 134350.30);
	acc.put("Abc", 1500.30);
	//Duplicate is not allowed so will not increase size
	//we can null key also
	acc.put(null, null);
	
	System.out.println("No. of acc holder="+acc.size());
	System.out.println(acc);
	
	Set <String> keys=acc.keySet();
	System.out.print("Account Holder Names");
	Iterator<String> it=keys.iterator();
	while(it.hasNext())
	{
		String name=it.next();
		System.out.print(name+",");
	}
	System.out.println();
	System.out.println("************");
	double bal=acc.get("Abc");
	System.out.println("A/c balance of Abc"+bal);
	bal=bal+1000;
	acc.put("Abc", bal);
	System.out.println(acc);
	System.out.println("************");
	//Set entries=acc.entrySet();//use to get each entry collection
     Set<Map.Entry<String,Double>> entries=acc.entrySet();
     Iterator <Map.Entry<String, Double>> its=entries.iterator();
     while(its.hasNext())
     {
    	 Map.Entry<String,Double> entry=its.next();
    	 System.out.println(entry.getKey()+"-"+entry.getValue());
     
     }

}
}

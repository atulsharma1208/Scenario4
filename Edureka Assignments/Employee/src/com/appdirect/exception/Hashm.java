package com.appdirect.exception;

import java.util.HashMap;
 
import java.util.Iterator;
 
import java.util.Map;
 
import java.util.Set;
 

public class Hashm {
 

public static void main(String[] args) throws InterruptedException {
 
HashMap<String,Double> accts=new HashMap<String,Double>();
 

accts.put("Sunil",10000.50);
 
accts.put("Suresh",12000.50);
 
accts.put("Sachin",14000.75);
 
accts.put("Rahul",16000.50);
 
accts.put(null,18000.50);
 

System.out.println("No of Account Holders = "+accts.size());
 
System.out.println(accts);
 

Set<String> keys=accts.keySet();
 

System.out.print("Account Holder Names : ");
 
Iterator<String> it=keys.iterator();
 
while(it.hasNext()){
 
String name=it.next();
 
System.out.print(name+", ");
 
}
 
System.out.println();
 
System.out.println("*********************");

double bal=accts.get("Sunil");
 
System.out.println("A/c balance of Sunil = "+bal);
 

bal=bal+1000;
 
accts.put("Sunil",bal);
 
System.out.println(accts);
 

System.out.println("*********************");
 

Set<Map.Entry<String, Double>> entries=accts.entrySet();
 
Iterator<Map.Entry<String,Double>> its=entries.iterator();
 
while(its.hasNext()){
 
Map.Entry<String,Double> entry=its.next();
 
System.out.println(entry.getKey()+" - "+entry.getValue());
 
Thread.sleep(1500);
 
}
}
 


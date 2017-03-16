package com.appdirect;

import java.io.Serializable;

public class Employee implements Serializable{
private int empno;
private String ename;
private double sal;
public Employee(){}
public Employee(int e,String n,double s){
	super();
	empno=e;
	ename=n;
	sal=s;
}

public String toString()
{
	return "Employee:"+this.empno+this.ename+"\t"+this.sal;
}
}

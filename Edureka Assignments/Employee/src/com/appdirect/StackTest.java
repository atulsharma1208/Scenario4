package com.appdirect;

import java.util.Stack;

public class StackTest {
public static void main(String args[])
{
	Stack<Integer> st=new Stack<>();
	System.out.println(st+"\tEmpty :"+st.isEmpty());
	System.out.println("Index of 10="+st.indexOf(10));

	st.push(10);
//	System.out.println("Index of 10="+st.indexOf(10));
	System.out.println("Index of 10="+st.indexOf(10));
	
	st.push(20);
	System.out.println("Index of 10="+st.indexOf(10));

	st.push(30);
	System.out.println(st+"\tEmpty :"+st.isEmpty());
System.out.println(st.pop());
System.out.println(st+"\tEmpty"+st.isEmpty());

}
}

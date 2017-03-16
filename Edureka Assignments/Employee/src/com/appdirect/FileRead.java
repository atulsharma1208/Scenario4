package com.appdirect;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
public class FileRead {
public static void main(String [] args)throws Exception
{
	FileInputStream fis=new FileInputStream("src/Java.txt");
/*	System.out.println("No of bytes to be read-"+fis.available());
int n=fis.read();
System.out.println(n);
System.out.println("Bo of bytes to be read-"+fis.available());

	int n=fis.read();
	while(n!=-1)
	{
		System.out.print((char)n);
		n=fis.read();
		Thread.sleep(60);
	}
	//reading the entire data
	byte[] b=new byte[fis.available()];
	fis.read(b);//each byte array contains ASCII value
	String s=new String(b);
	System.out.println(s);
fis.close();
*/

//convert byte stream to char stream

	InputStreamReader in=new InputStreamReader(fis);
BufferedReader br=new BufferedReader(in);
String line=br.readLine();
while(line!=null)
{ System.out.println(line);
line=br.readLine();
Thread.sleep(2000);
	
}
}
}

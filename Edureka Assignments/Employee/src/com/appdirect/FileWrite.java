package com.appdirect;

import java.io.FileWriter;

public class FileWrite {
 public static void main(String args[])throws Exception
 {
/*FileOutputStream fos=new FileOutputStream("src/Alphabet.txt",true);//true is used to save contents of file if already exists.
byte [] b=new byte[26];
for(int i=0,n=65;i<b.length;i++,n++)
{
	b[i]=(byte)n;
}
fos.write(b);
System.out.println("File Created");
*/
	 FileWriter fw=new FileWriter("Sample.txt");
fw.write("Java is alnaguage");
fw.write("\r \n");
fw.write("used to develop platform independent applications");
	 fw.close();
 }

}

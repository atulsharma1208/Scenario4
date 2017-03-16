package first;
import java.util.Scanner;
public class Array_test {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name of student");
	String name=sc.nextLine();
	System.out.println("Enter number of subjects");
	int n=sc.nextInt();
int [] marks=new int[n];
for(int i=0;i<n;i++)
{
	System.out.println("Subject-"+(i+1)+" marks:");
	marks[i]=sc.nextInt();
}
System.out.println("***************");
System.out.println("No. of student: "+name);
int total=0;
for(int i=0;i<marks.length;i++)
{
	total+=marks[i];
}
System.out.println("Total marks"+total);
System.out.println("Average of marks="+(total/5));
}
}

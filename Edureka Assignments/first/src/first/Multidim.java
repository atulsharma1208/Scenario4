package first;

public class Multidim {
public static void main(String args[])
{
	int [][] n={{1,2,3,},{4,5,},{6,7,8,9}};
	System.out.println(n.length);
	for(int i=0;i<n.length;i++)
	{
		System.out.println("Size of n["+i+"]"+n[i].length);
	}
	for(int i=0;i<n.length;i++)
	{ for(int x:n[i])
	{
		System.out.print(x+"\t");
	}
	System.out.println();
		
	}
}
}

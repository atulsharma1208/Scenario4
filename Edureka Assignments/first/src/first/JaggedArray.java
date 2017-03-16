package first;

public class JaggedArray {
	public static void main(String args[])
	{
	int [][] n=new int [5][];
	n[0]=new int[3];
	n[1]=new int[6];
	n[2]=new int[5];
	for(int i=0;i<n.length;i++)
	{
		for(int x:n[i])
		{
			System.out.print(x);
		}
		System.out.println();
	}
	
	}
	

}

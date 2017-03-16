
public class CmdArgs {
	public static void main(String args[])
	{
		System.out.println("No. of cmd args= "+args.length);
	  if(args.length>0)
	  {
		  System.out.println("Cmd Args are:");
		  for(String s:args)
		  {
			  System.out.println(s);
		  }
	  }
	}

}

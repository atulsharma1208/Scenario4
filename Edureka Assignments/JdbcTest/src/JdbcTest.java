import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
public class JdbcTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","password");
    java.sql.Statement st=con.createStatement();
    String s="Y";
  /*  while(s.equalsIgnoreCase("Y"))
    {
    	int id;
		String name,pass,email,coun;
    	System.out.println("Enter id,name,email,country,password");
    	id=obj.nextInt();
    	name=obj.next();
    	pass=obj.next();
    	email=obj.next();    //"insert into emp values("+eno+",'"+name+"',"+sal+")";       
    	coun=obj.next();
    	try{  
    		String sql="insert into Users values("+id+",'"+name+"','"+pass+"','"+email+"','"+coun+"')"; 
    		int n=st.executeUpdate(sql); 
    		System.out.println("Employee Saved"); 
    		} 
    	catch(Exception e){ 
    		System.out.println(e.toString()); 
    		} 
    	System.out.print("Do you want to add more employees>[Y/N] : \t"); 
    	s=obj.next(); 
    }*/
  /*  try 
    {  System.out.println("Enter id to delete");
    	int did=obj.nextInt();
    	String del="delete from Users where id="+did;
    	int n=st.executeUpdate(del);
    	 
    }catch(Exception e)
    {
    	System.out.println(e.toString()); 
    }*/
    String str="select * from Users";
    ResultSet rs=st.executeQuery(str);
    System.out.println("No name");
    while(rs.next())
    	{
    	try{
    	
    	System.out.print(rs.getString(1));
    	System.out.print(" "+rs.getString(2));
    }
    catch(Exception e)
    {
    	System.out.println(e.toString());
    }
    	System.out.println();
	}
    st.close(); 
    con.close(); 

	}

}

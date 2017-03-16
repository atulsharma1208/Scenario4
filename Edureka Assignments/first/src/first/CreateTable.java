package first;
import java.sql.*;
public class CreateTable {
	public static void main(String args[]) throws Exception
	{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","password");
 Statement st=con.createStatement();
	String sql="create table emp(empno int(5) primary key,ename varchar(20),age int(2)";
	try{
		st.executeQuery(sql);
		System.out.println("DB created");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	st.close();
	con.close();
	}
}


import java.sql.*;

import com.mysql.jdbc.*;
import com.mysql.jdbc.Connection;

public class Stud 
{
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
        Class.forName("com.mysql.jdbc.Driver");
		Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Temp","root","password");
		java.sql.Statement st= con.createStatement();
		
	//	st.execute("create table Student(id int(3) primary key,name varchar(20),classs varchar(20),marks int(3)");
		
		//System.out.println("Table is created");
		 st.executeUpdate("insert into  Student values(1,'abc','12th',98)") ;
		 st.executeUpdate("insert into  Student values(2,'def','12th',97)") ;
		 st.executeUpdate("insert into  Student values(3,'ghi','12th',96)") ;
		 st.executeUpdate("insert into  Student values(4,'jkl','12th',99)") ;
		 st.executeUpdate("insert into  Student values(5,'mno','12th,92)") ;
		 
		 st.executeUpdate("update Student set name='rahul',marks=85 where id=3");
		 
		 
		 st.executeUpdate("delete from Student where id=5");
		 
		con.close();
	}

}

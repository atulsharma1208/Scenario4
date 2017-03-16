
public class Employee {
int empno;
String ename;
double sal;
 Employee()
{  System.out.println("***");
	empno=101;
ename="Atul";
sal=15000;

}

void setData()
{
	empno=101;
	ename="Atul";
	sal=15000;
}
void getData()
{
	System.out.println(empno+"\t"+ename+"\t"+sal);
}
	
	public static void main(String args[])
	{
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
	
		//System.out.println(emp.empno+"\t"+emp.ename+"\t"+emp.sal);
	 
		emp1.getData();
	  emp2.getData();
       emp3.getData();	
 	}
}


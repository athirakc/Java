package dem_Oper;

class Student
{ 
	int id;  
	String name;  
}  
class StudentID
{  
public static void main(String args[])
{  
	Student s1=new Student();  
	s1.id=1001;  
	s1.name="Arun.J";  
	System.out.println("Student ID : " +s1.id+"\n"+"Student Name : "+s1.name);
}

}
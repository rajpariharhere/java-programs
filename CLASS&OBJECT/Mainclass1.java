class Student
{
	int id;
	double cgpa;
	void write()
	{
		System.out.println(id+" is writting");
	}
	void listen()
	{
		System.out.println("Student is having CGPA : "+cgpa);
	}
}
public class Mainclass1
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.id=101;
		s1.cgpa=7.8;
		s1.write();
		s1.listen();
		System.out.println("------------------------");
		Student s2=new Student();
		s2.id=102;
		s2.cgpa=8.1;
		s2.write();
		s2.listen();
		
	}
}   
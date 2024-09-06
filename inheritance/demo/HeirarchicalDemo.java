package inheritance.demo;

import polymorphism.MainArea;

class User
{
	String Name;
	int Age;
	long contactNo;
}

class Employee extends User

{
	String Specialization;

	void ShowData()
	{
		Name="Rahul";
		System.out.println(Name);
		Age=42;
		System.out.println(Age);
		contactNo=787875412;
		System.out.println(contactNo);
		Specialization="SoftWare Engineer";
		System.out.println(Specialization);

	}

}

class Manager extends User
{
	String Department;

	void DisplayData()
	{
		Name="Rohit";
		System.out.println(Name);
		Age=22;
		System.out.println(Age);
		contactNo=988875412;
		System.out.println(contactNo);
		Department="Engineer";
		System.out.println(Department);
	}
}

public class HeirarchicalDemo {
	public static void main(String[] args) {

		Manager m=new Manager();
		m.DisplayData();
		
		System.out.println("----------");
		Employee e= new Employee();
		e.ShowData();

	}

}

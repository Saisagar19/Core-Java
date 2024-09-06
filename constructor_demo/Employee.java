package constructor_demo;

public class Employee {

	String Name;
	float salary;


	public Employee( String s, float f) {

		Name=s;
		salary=f;

	}
	void displayData()
	{
		System.out.println("Name: "+Name+" Salary: "+salary);
	}

	public static void main(String[] args) {

		Employee e = new Employee("Ram",82254.64f);
		e.displayData();
		
		Employee e1 = new Employee("Sham",889254.64f);
		e1.displayData();
		Employee e2 = new Employee("Rahul",92254.64f);
		e2.displayData();
		
		

	}

}

package polymorphism;

public class Student {
	String name;
	int Age;
	String email;

	public void setData(String name , int Age) {
		this.name = name;
		this.Age=Age;
	}
	
	public void setData(String name , int Age,String email) {
		this.name = name;
		this.Age=Age;
		this.email=email;
		
	}
	
	void DisplayData()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+Age);
		System.out.println("Email: "+email);
		
	}
	
	
	
	
	
	

}

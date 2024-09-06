package methodsDemo;

public class MethodChaning {

	// Method chaining --> calling one method from another method
	void display()
	{
		System.out.println("No arguments");
		
	}
	void display(int num)
	{
		this.display();// calling another method
		System.out.println("1 arguments");
		System.out.println(num);
	}
	void display(int num, String name)
	{
		this.display(num);		// calling another method 
		System.out.println("2 arguments");
		System.out.println(num+" "+name);
		
	}
	public static void main(String[] args) {
		MethodChaning m= new MethodChaning();
		m.display(100, "Sagar");    //  Calling one method  so it will print m1,m2 and m3 data
	}
}

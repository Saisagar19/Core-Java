package methodsDemo;

public class MyClass {
	
	public static void display()
	{
		System.out.println("hello everyone!!!");
	}
	
	public void displayData()
	{
		System.out.println("hello guys!!!");
	}
	public static void main(String[] args) {
		
		MyClass m = new MyClass();
		m.displayData();
		MyClass.display();
	}

}

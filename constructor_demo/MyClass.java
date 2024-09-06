package constructor_demo;

public class MyClass {
	
	int side;
	int length;
	int breadth;
	
	// Method overloading
	void area(int side)
	{
		int area=side*side;
		System.out.println("Area of square: "+area);
	}
	void area (int length, int breadth)
	{
		int area=length	*breadth;
		System.out.println("Area of rectangle: "+area);
	}
	
	void displayArea()
	{
		area(4);
		area(4,8);	
	}
	public static void main(String[] args) {
		
		MyClass m = new MyClass();
		m.displayArea();
		
	}

}

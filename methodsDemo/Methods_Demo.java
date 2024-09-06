package methodsDemo;

public class Methods_Demo {
	
	//Static Method
	static void ShowMessage()
	{
		System.out.println("Hi World");
	}
	
	//non-static methods & Type with no-args and no return Type
	
	void add()
	{
		int a=4;
		int b=8;
		System.out.println("Add: "+a+b);
	}
	
	//Type with No-args but with return type 

	 int Division()
	{
		
		int z=8/2;
		int result=z;
		
		return result;
	}
		
	// type with no return type and with args
	
	void multiply(int a,int b)
	{
		System.out.println("Multyply : "+a*b);
	}
	public static void main(String[] args) {
		Methods_Demo m = new Methods_Demo();
		m.add();
		m.multiply(2, 8);
		ShowMessage();
		System.out.println(m.Division());
		
	}
}

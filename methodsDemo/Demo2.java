package methodsDemo;

public class Demo2 {
	public static void sub()
	{
		int a=22;
		int b=12;
		int result=a-b;
		displayResult(result);
	}
	
	public static void displayResult(int result) 
	{
	
		System.out.println("The result is "+result);
	}

	public static void main(String[] args) {
		sub();
	}
}

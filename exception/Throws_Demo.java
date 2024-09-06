package exception;

public class Throws_Demo {

	static void m1() throws ArithmeticException // delegate to Main
	{
		m2();
	}
	static void m2() throws ArithmeticException // delegate to M1
	{
		m3();
	}
	static void m3() throws ArithmeticException
	{
		System.out.println(34/0); // delegate to M2
	}
	 
	public static void main(String[] args) 
	{
		try {
			m1();
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}

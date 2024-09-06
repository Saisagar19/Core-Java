package exception;

public class Assign4 {

	static void m1() throws NullPointerException
	{
		System.out.println("inside throw method");
		
		throw new NullPointerException();
		
	}
	
	public static void main(String[] args) {
		
		try
		{
			m1();
			
		}catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

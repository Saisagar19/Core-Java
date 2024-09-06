package custom_exception;

public class Assign8Main {
	
	public static void main(String[] args) {
		
		Assign8 a = new Assign8();
		
		try {
		int division=a.division(4, 2);
		System.out.println("Division: "+division);
		
		int length=a.StringLength(null);
		
		System.out.println("length: "+length);
		}
		catch(DivideByZeroException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NullStringException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	

}

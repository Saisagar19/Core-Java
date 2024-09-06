package custom_exception;

public class Assign7Main {
	public static void main(String[] args) {
		
		Assign7 a = new Assign7();
		try {
		a.checkEligibility(10, 20);
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Have a nice day");
	}
}

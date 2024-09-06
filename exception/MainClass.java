package exception;

public class MainClass {
	public static void main(String[] args) {

		int a=64;
		int b=0;

		try //write the Risky code in try Catch Block that will give you exception
		{
			System.out.println("Division: " +a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("b should not be Zero");
		}
		System.out.println("End of the program");
	}


}

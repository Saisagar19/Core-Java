package custom_exception;

public class Operations {

	void Division(int numerator,int denominator)
	{
	
		
		if(denominator==0)
		{
			try
			{
				throw new ArithmeticDemoException();
			}
			catch(ArithmeticDemoException e)
			{
				System.out.println("/ by Zero");
			}
		}
		else
		{
			System.out.println("Ans: "+numerator/denominator);
		}
		
		
	}
}

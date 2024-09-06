package custom_exception;

public class Assign7 {

	void checkEligibility( int age ,int weight) throws ArithmeticException
	{
		if(age<12 && weight<40)
		{
			throw new ArithmeticException("Student is not eligible for registration ");
		}
		else
		{
			System.out.println("Entries are Valid");
		}
	}
}

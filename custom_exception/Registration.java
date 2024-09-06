package custom_exception;

public class Registration {
	void register(int age)
	{
		if(age< 18)
		{
			// invoke an Custom Exception using "throw" keyword
		try {	
		 throw new InvalidAgeException();
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Age is < than 18");
		}
		}
		else
		{
			System.out.println("Elegible for Voting");
		}
	}

}

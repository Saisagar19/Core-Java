package custom_exception;

public class MyOwnExceptionTest {
	
	static void employeeAge(int age) throws  MyOwnException 
	{
		if(age<0)
		{
			throw new MyOwnException("Age can not be Negative");
		}
		else
		{
			System.out.println("Age is invalid");
		}
	}

}

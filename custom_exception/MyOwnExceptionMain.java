package custom_exception;

public class MyOwnExceptionMain {
	public static void main(String[] args) {
		try {
			MyOwnExceptionTest.employeeAge(-1);
		}
		catch(MyOwnException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}

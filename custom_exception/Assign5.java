package custom_exception;

import java.util.Scanner;

public class Assign5 {

	static int sum(int num1,int num2) throws ArithmeticException
	{
		
		if(num1==0)
		{
			throw new ArithmeticException("First Arg is not valid");
		}
		else {
			
			System.out.println("Both args are correct");
		}
		return num1+num2;
	}

}

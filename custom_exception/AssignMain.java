package custom_exception;

import java.util.Scanner;

public class AssignMain {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter Num1: ");
		int num2=sc.nextInt();
		
		try {
			System.out.println("Sum of num1 and num2: "+Assign5.sum(num1, num2));
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

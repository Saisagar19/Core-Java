package control_statements.iterative;

import java.util.Scanner;

public class Factorial {
	void logic()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=i*fact;
		
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
	
	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		f.logic();
	}

}

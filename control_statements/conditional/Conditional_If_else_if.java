package control_statements.conditional;

import java.util.Scanner;

public class Conditional_If_else_if {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter n1: ");
		int n1= sc.nextInt();
		
		if(n1>0)
		{
			System.out.println(n1+" positive number");
			
		}
		else if(n1<0)
		{
			System.out.println(n1+" negative number");
			
		}
		else
		{
			System.out.println(n1+ " is zero " );
		}
		
		
	}

}

package control_statements.conditional;

import java.util.Scanner;

public class Conditional_If_else {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Number 1: ");
		int n1=sc.nextInt();
		
		System.out.println("Enter Number 2: ");
		int n2=sc.nextInt();
		
		if(n1>n2)
		{
			System.out.println(n1+" is grater then "+n2);
		}
		else
		{
			System.out.println(n2+" is grater then "+n1);
		}
	}
}

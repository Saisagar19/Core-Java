package control_statements.iterative;

import java.util.Scanner;

public class Sum_of_digit {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number: ");
		int sum=0;
		int num=sc.nextInt();
		while(num!=0)
		{
			int result=num%10;
			sum=result+sum;
			num=num/10;
			
		}
		System.out.println("Sum of digit: "+sum);
		
	}

}

package control_statements.iterative;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int reverse=0;
		int temp=num;
		
		while(num>0)
		{
			int result=num%10;
			reverse=(reverse*10)+result;
			num=num/10;
		}
		if(reverse==temp)
		{
			System.out.println(+reverse+" is a palindrome");
		}
		else
		{
			System.out.println(+reverse+" is not a palindrome");
		}
	}
}

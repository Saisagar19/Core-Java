package control_statements.iterative;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number: ");
	
	int num=sc.nextInt();
	int rev=0;
	
	while(num>0)
	{
		int result=num%10;
		rev=(rev*10)+result;
		num=num/10;
	}
	System.out.println("Reverse of a number: "+rev);
}
}

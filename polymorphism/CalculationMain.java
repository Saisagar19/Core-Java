package polymorphism;

import java.util.Scanner;

public class CalculationMain {
	public static void main(String[] args) {
		
		Calculate C = new Calculate();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter No.1 :");
		int a=sc.nextInt();
		System.out.println("Enter No.2 :");
		int b=sc.nextInt();
		C.sum(a,b);
		
		System.out.println("Enter Dec No.1 :");
		double c=sc.nextDouble();
		System.out.println("Enter Dec No.2 :");
		double d=sc.nextDouble();
		C.sum(c, d);
	}

}

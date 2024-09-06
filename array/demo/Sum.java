package array.demo;

import java.util.Scanner;

public class Sum {
	
	Scanner sc = new Scanner(System.in);
	
	//Accepting Elements from User
	void accept(int a[]) {

		System.out.println("enter element: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	}

	// Displaying Elements
	void display(int a[]) {

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	// Displaying Sum of An Element
	void sum(int a[]) {
		
		System.out.println("Addition: ");
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			
			sum=a[i]+sum;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Size: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		Sum s = new Sum();

		s.accept(a);
		s.display(a);
		s.sum(a);

	}

}

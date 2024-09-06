package array.demo;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		int a[]= new int[size];
		int b[]=new int [a.length];
		
		System.out.println("Enter Element: ");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array A elements: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
		System.out.println("Copied element from A to B:");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}

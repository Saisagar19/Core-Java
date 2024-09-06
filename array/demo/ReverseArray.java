package array.demo;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of an Array: ");
		int size=sc.nextInt()	;
		int a[]=new int[size];
		int b[]=new int[a.length];
		
		System.out.println("Enter element in An Array: ");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in an Arra: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("arrays in reverse: ");
		for (int i = a.length-1; i >= 0; i--) {
			System.out.println(a[i]);
		}
		
	}

}

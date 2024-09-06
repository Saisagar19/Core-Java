package array2D;

import java.util.Scanner;

public class Array2Dex3 {
	public static void main(String[] args) {

	
		//WAP to create 2D Array to display its Elements using Loop and Scanner
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an 2D Array: ");
		int size = sc.nextInt();
		int a[][]=new int[size][size];
		System.out.println("Enter element: ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
	}

}

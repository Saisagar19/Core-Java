package array2D;

public class Array2Dex2 {

	public static void main(String[] args) {

		//WAP to create 2D Array and find Min element from it
		
		int a[][] = { { 55, 44, 88, }, { 1, 8, 9 }, { 22, 85, 91 } };

		int max = 0;
		int min = 0;

		// Displaying 2D Array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// finding out the max element so we can store it in min element for further
		// process
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}

		min = max;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}
		}
		System.out.println("Smallest element in 2D array: " + min);

	}
}

package array2D;

public class Array2D_ex5 {
	public static void main(String[] args) {

		//WAP to create 2D Array and find even number present in an array
		int a[][] = { { 2, 5, 7 }, { 8, 3, 1 }, { 5, 9, 6 } };

		// Displaying 2D Array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] % 2 == 0) {
					System.out.println("Even Number From 2d Array: " + a[i][j]);
				}
			}
		}
	}

}

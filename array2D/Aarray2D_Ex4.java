package array2D;

public class Aarray2D_Ex4 {
	public static void main(String[] args) {

		//WAP to create 2D Array And find subtraction of 2 Arrays
		
		int a[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };

		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };


		System.out.println("Matrix A: ");
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Matrix B: ");
		for (int i = 0; i < b.length; i++) {

			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Matrix C i.e Add A - B : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int sub = a[i][j] - b[i][j];
				System.out.print(sub + " ");
			}
			System.out.println();
		}

	}

}

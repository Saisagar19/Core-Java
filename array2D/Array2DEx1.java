package array2D;

public class Array2DEx1 {
	public static void main(String[] args) {

		//WAP to create 2D Array and find Max element from it
		
		int b[][] = { { 85, 2, 3 }, { 414, 10, 6 }, { 99, 8, 9 } };

		System.out.println("Matrix B: ");
		for (int i = 0; i < b.length; i++) {

			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		int max = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (b[i][j] > max) {
					max = b[i][j];
				}
			}
		}
		System.out.println("Greatest Value From 2D array: "+max);

	}

}

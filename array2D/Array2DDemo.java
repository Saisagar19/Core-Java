package array2D;

public class Array2DDemo {
	public static void main(String[] args) {
		
		//WAP to create 2D Array to display its Elements
		
		//declaring Method 1
		//int a[][]= {{11,21,301},{1,251,14},{41,19,81}};
		
		//declaring Method 2
		int a[][]=new int[3][3];
		a[0][0]=11;
		a[0][1]=21;
		a[0][2]=301;
		a[1][0]=1;
		a[1][1]=251;
		a[1][2]=14;
		a[2][0]=41;
		a[2][1]=19;
		a[2][2]=81;
		System.out.print(a[0][0]+" ");
		System.out.print(a[0][1]+" ");
		System.out.println(a[0][2]);
		System.out.print(a[1][0]+" ");
		System.out.print(a[1][1]+" ");
		System.out.println(a[1][2]);
		System.out.print(a[2][0]+" ");
		System.out.print(a[2][1]+" ");
		System.out.print(a[2][2]);
		
		
		
		
		
	}

}

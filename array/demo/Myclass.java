package array.demo;

public class Myclass {
	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 22;
		a[1] = 23;
		a[2] = 55;
		a[3] = 66;
		a[4] = 44;

		// Array print Method 1
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("---------------------");
		
		// Array print Method 2
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}

	}

}

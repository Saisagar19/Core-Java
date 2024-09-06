package exception;

public class Array {


	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		try {
			System.out.println(a[8]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please give index within the range");
		}
		finally {
			System.out.println("Bye Bye");
		}
	}
}

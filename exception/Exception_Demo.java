package exception;

public class Exception_Demo {

	public static void main(String[] args) {
		String name = null;
		
		try {
			System.out.println(name.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("name should not be null ");
		}

		int a[]= {1,2,3,4,5};
		try {
			System.out.println(a[9]);
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please give index within the range");
		}
		int n1=89;
		int n2=0;
		try {
			System.out.println(n1/n2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number should not be Zero");
		}
	}

}

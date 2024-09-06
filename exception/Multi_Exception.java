package exception;

public class Multi_Exception {

	public static void main(String[] args) {
		String name = "Sagar";
		int a[]= {1,2,3,4,5};
		int n1=89;
		int n2=0;

		try {
			System.out.println(name.length());
			System.out.println(a[3]);
			System.out.println(n1/n2);
			}

		catch(NullPointerException e)
		{
			System.out.println("name should not be null ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please give index within the range");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number should not be Zero");
		}
	}

}



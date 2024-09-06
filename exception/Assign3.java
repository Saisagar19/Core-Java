package exception;

public class Assign3 {

	public static void main(String[] args) {

		int a[]= {12,56,78,34,11};

		
		try {
			for(int i=0;i<a.length;i++)
			{
				
				System.out.println("Array a= "+a[i]);
			}
			
			int b=a[4]/0;
			System.out.println(b);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please give index within the range");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number should not be Zero");
		}
		catch(NullPointerException e)
		{
			System.out.println("name should not be null");
		}
		catch(Exception e)
		{
			System.out.println("Exception has been occured");
		}
	}

}

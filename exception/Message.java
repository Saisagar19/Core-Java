package exception;

public class Message {
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

		catch(NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println(e.getMessage()); // It will delivered msg for Exception
		}
	}

}

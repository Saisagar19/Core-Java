package polymorphism;

public class Calculate {

	public void sum(int a,int b)
	{
		int c=a +b;
		System.out.println("Addition :" +c);
	}
	public void sum(double a,double b)
	{
		double c=a +b;
		System.out.println("Addition :" +c);
	}
	
}

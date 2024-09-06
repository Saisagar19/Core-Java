package polymorphism;

public class Overload {
	void Demo(int a)
	{
		System.out.println(a);
	}
	
	void Demo(int a, int b)
	{
		
		System.out.println(a+","+b);
		
	}
	
	double Demo(double a)
	{
	
		System.out.println(a);
		return a*a;
	}
	
	int Demo(int a, int b,int c)
	
	{
		
		return a+b+c;
	}
	

}

package methodsDemo;

public class Example2 {

	void prime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" not a prime number");
		}

	}
	void even_odd(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+" is a even number");
		}
		else
		{
			System.out.println(num+" not a odd number");
		}


	}
	
	int greatest(int num1,int num2)
	{
		System.out.println("Greatest Number between Num1 and Num2");
		if(num1>num2)
		{
			
			return num1;
		}
		else {
			return num2;
		}
	}
	
	int smallest(int num1,int num2,int num3)
	{
		System.out.println("Smallest Number between Num1 , Num2 and num3");
		if(num1<num2 && num1<num3)
		{
			
			return num1;
		}
		else if(num2<num1 && num2<num3)
		{
			
			return num2;
		}
		else
		{
			return num3;
		}
	}
	
	public static void main(String[] args) {
		
		Example2 ex = new Example2();
		ex.even_odd(2);
		ex.prime(13);
		System.out.println(ex.greatest(12, 6));
		System.out.println(ex.smallest(0, 1, 5));
	}

	


}

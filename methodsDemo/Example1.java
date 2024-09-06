package methodsDemo;

public class Example1 {

	int add(int num)
	{
		int sum=0;
		//sum of digits of a number 
		for(;num!=0;)
		{
			int result=num%10;
			sum=result+sum;
			num=num/10;
		}
		return sum;
		
	}
	
	void table(int num) {
		
		System.out.println("Table of a"+num+": ");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*num);
		}
	}
	public static void main(String[] args) {
		Example1 ex = new Example1();
		System.out.println(ex.add(123));
		ex.table(2);
	}
}

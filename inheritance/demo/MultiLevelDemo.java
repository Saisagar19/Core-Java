package inheritance.demo;

class X 
{
	int num1;
	String Name;
	
}

class Y extends X
{
	int num2;
	float num3; 
}

class Z extends Y
{
	float num4;
	
	void DisplayData()
	{
		num1=22;
		num2=77;
		Name="Sagar";
		num3=77.25f;
		num4=88.36f;	
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(Name);
	}
}

public class MultiLevelDemo {
	
	public static void main(String[] args) {
		
		Z z= new Z();
		z.DisplayData();
	}
	

}

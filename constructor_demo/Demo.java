
package constructor_demo;

public class Demo {

	
	int num; // instance
	public Demo(int num) {
	
		this.num=num;
	}
	
	void Display()
	{
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Demo d = new Demo(98);
		d.Display();
	}
}

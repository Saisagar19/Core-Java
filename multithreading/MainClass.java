package multithreading;

public class MainClass {
	public static void main(String[] args) {

		DemoT d=new DemoT(); //new State
		d.start();// ready state

		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());

		}
	}
}

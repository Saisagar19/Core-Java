package multithreading;

public class DemoT extends Thread {
	
	@Override
	public void run() //running State
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}

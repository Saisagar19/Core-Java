package multithreading.synchronizedDemo;

public class Test {
	
	synchronized static void displayMessage()
	{
		System.out.println(Thread.currentThread().getName()+" : says good morning");
	}

}

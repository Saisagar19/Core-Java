package multithreading.synchronizedDemo;

public class SynchronizedClass {
	synchronized static void ShowMessage()
	{
		System.out.println(Thread.currentThread().getName()+" Says: Hello");
	}

}

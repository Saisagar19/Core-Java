package multithreading;

public class Test {

	public static void main(String[] args) {


		ThreadDemo t = new ThreadDemo();

		Thread thread = new Thread(t);
		thread.start();
		thread.setName("First Thread");  // you can give a Thread a name using setName()
		thread.setPriority(2);  		// you can give a Thread a priority using setPriority()
		
		ThreadDemo t1 = new ThreadDemo();

		Thread thread1 = new Thread(t1);
		thread1.start();
		thread1.setName("Second Thread");
		thread.setPriority(10); 
	}
}

package multithreading.synchronizedDemo;

public class ThreadDemo extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			Test.displayMessage();
			
			
		}
	}

}

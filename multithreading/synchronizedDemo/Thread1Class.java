package multithreading.synchronizedDemo;

public class Thread1Class extends Thread {
	@Override
	public void run() {
	
		for (int i = 0; i < 5; i++) {
			SynchronizedClass.ShowMessage();
		}
	}

}

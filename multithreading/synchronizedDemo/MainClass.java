package multithreading.synchronizedDemo;

public class MainClass {
	
	public static void main(String[] args) {
		
		ThreadDemo d1=new ThreadDemo();
		d1.setName("Thread-1");
		d1.start();
		
		
		ThreadDemo d2=new ThreadDemo();
		d2.setName("Thread-2");
		d2.start();
	}

}

package multithreading.synchronizedDemo;

public class Test2 {
	public static void main(String[] args) {
		
		Thread1Class th1=new Thread1Class();
		th1.start();
		Thread1Class th2=new Thread1Class();
		th2.start();
	}

}

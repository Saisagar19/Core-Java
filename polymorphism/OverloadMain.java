package polymorphism;

public class OverloadMain {
	public static void main(String[] args) {
		Overload o=new Overload();
		o.Demo(8);
		o.Demo(2, 5);
		System.out.println(o.Demo(22.66));
		System.out.println(o.Demo(1, 5, 9));
		
	}

}

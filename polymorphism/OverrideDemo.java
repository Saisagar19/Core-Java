package polymorphism;

public class OverrideDemo {

	public static void main(String[] args) {
		BaseClass b = new BaseClass();
		b.m1();
		
		DerivedClass d = new DerivedClass();
		d.m1();
	}
}

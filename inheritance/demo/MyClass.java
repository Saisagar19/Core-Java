package inheritance.demo;

class A {
	int num1 = 25;

	void display() {
		System.out.println("Hi from Parent class Method ");
	}
}

class B extends A // Single Inheritance
{
	int num2 = 55;

	void Show() {
		System.out.println("Hi from child class Method ");
	}
}

public class MyClass {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.num1);
		a.display();

		B b = new B();
		System.out.println(b.num1);
		System.out.println(b.num2);
		b.Show();
		b.display();

	}
}

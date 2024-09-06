package abstractDemo;

public abstract class A {

	A()
	{
		System.out.println("A Class constructor");
	}
	//Abstract method
	abstract void sum();
	
	// non-static method
	void M2()
	{
		System.out.println("Method 2 in A class");
		M4();
	}
	// static method
	static void M3()
	{
		System.out.println("Static method M3");
	}
	// Private method
	private void M4()
	{
		// Scope of this access specifier is within class 
		// Or we can call this method by using method chaining concept.
		System.out.println("Private method");
	}
}

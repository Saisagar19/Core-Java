package interfaceDemo;

public interface Interface1 {
	
	//non-static method are not allowed
	
	//by default abstract methods are present
	void M1();
	void M2();
	
	//optional method 
	default void M3()
	{
		System.out.println("Default method in a interface class");
	}
	
	// static methods are present in an interface
	static void M4()
	{
		System.out.println("Staic method in a interface class");
	}

}

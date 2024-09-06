package constructor_demo;

import methodsDemo.MethodChaning;

public class ConstructorChaning {

	// constructor chaining --> calling one constructor from another constructor
		public ConstructorChaning()
		{
			System.out.println("No arguments");
			
		}
		public ConstructorChaning(int num)
		{
			this();// calling another constructor
			System.out.println("1 arguments");
			System.out.println(num);
		}
		public ConstructorChaning(int num, String name)
		{
			this(num);		// calling another constructor
			System.out.println("2 arguments");
			System.out.println(num+" "+name);
			
		}
		public static void main(String[] args) {
			ConstructorChaning m= new ConstructorChaning(100, "Sagar"); //  Calling one constructor  so it will print c1,c2 and c3 data
			    
		}
}

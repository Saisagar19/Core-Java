package inheritance.demo;

class P
{
	int Age;
	String Name;
	boolean S;
	
	
	public P() {
		System.out.println("P() constructor calling");
	}
	
	void Display()
	{
		Age=55;
		Name="Donald";
		S=true;
		System.out.println("parent class Method");
	}
}

class Q extends P
{
	int Age;
	String Name;
	boolean k;
	
	public Q() {
		// using super keyword P( )constructor will be called ;
		System.out.println("Q() constructor calling");
	}
	void Display()
	{
		// using super keyword parent class method will be called ;
		super.Display();
		Age=65;
		Name="Melodi";
		k=false;
		
		System.out.println(Age+" "+Name+" "+k);
		
		// using super keyword instance variables of parent class will be called ;
		System.out.println(super.Age+" "+super.Name+" "+S);
	}
} 
public class Constructor {
	
	public static void main(String[] args) {
		Q q= new Q();
		q.Display();
		
	}

}

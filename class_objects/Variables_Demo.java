package class_objects;

public class Variables_Demo {
	
	String FirstName;	// Instance Variable
	String LastName;	// Instance Variable
	
	static int age;			// Static variable
	static int MobileNo;	// Static variable
	
	public static void main(String[] args) {
		
		String Gender; 	// local variable
		
		Gender="male";
		
		Variables_Demo v1=new Variables_Demo();
		v1.FirstName="Sagar";
		v1.LastName="Ambekar";
		
		System.out.println(v1.FirstName);
		System.out.println(v1.LastName);
		
		age=15;
		MobileNo=976545466;
		
		System.out.println(Variables_Demo.age);
		System.out.println(Variables_Demo.MobileNo);
		
		System.out.println(Gender);
		System.out.println("------------");
		
		Variables_Demo v2=new Variables_Demo();
		v2.FirstName="Sahil";
		v2.LastName="jadhav";
		
		System.out.println(v2.FirstName);
		System.out.println(v2.LastName);
		
		age=14;
		MobileNo=906445466;
		
		System.out.println(Variables_Demo.age);
		System.out.println(Variables_Demo.MobileNo);
		
		System.out.println(Gender);
		
		
	}

}

package constructor_demo;

public class Student {
	String Name;
	int rollNo;
	float marks;
	String address;
	
	//Constructor Overloading

	public Student( String s, int a, float f, String j  ) {		// 4 args constructor
		Name=s;
		rollNo=a;
		marks=f;
		address=j;

	}

	public Student( String s, int a) {		// 2 args constructor
		Name=s;
		rollNo=a;
	}

	public Student( String s) {		// 1 args constructor
		Name=s;

	}

	public static void main(String[] args) {
		Student s=new Student("Sagar",21,300.f,"Pune");
		System.out.println(s.Name+" "+s.rollNo+" "+s.marks+" "+s.address);
		
		Student s1=new Student("Rahul",22);
		System.out.println(s1.Name+" "+s.rollNo);
		
		Student s2=new Student("Rohit");
		System.out.println(s2.Name);


	}

}

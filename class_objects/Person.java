package class_objects;

import java.util.Scanner;

public class Person {

	String name;
	int Age;
	String Gender;
	String Gmail;

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Person 1 Details: ");

		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();

		System.out.println("Enter person 1 Name: ");
		p1.name=sc.next();

		System.out.println("Enter person 1 Age: ");
		p1.Age=sc.nextInt();

		System.out.println("Enter person 1 gender: ");
		p1.Gender=sc.next();

		System.out.println("Enter person 1 gamil: ");
		p1.Gmail=sc.next();

		System.out.println("Enter person 2 Name: ");
		p2.name=sc.next();

		System.out.println("Enter person 2 Age: ");
		p2.Age=sc.nextInt();

		System.out.println("Enter person 2 gender: ");
		p2.Gender=sc.next();

		System.out.println("Enter person 2 gamil: ");
		p2.Gmail=sc.next();

		System.out.println("Enter person 3 Name: ");
		p3.name=sc.next();

		System.out.println("Enter person 3 Age: ");
		p3.Age=sc.nextInt();

		System.out.println("Enter person 3 gender: ");
		p3.Gender=sc.next();

		System.out.println("Enter person 3 gamil: ");
		p3.Gmail=sc.next();

		System.out.println("Person 1 Details: ");

		System.out.println("Name: "+p1.name+" Age :"+p1.Age+" Gender: "+p1.Gender+ " Gmail: "+p1.Gmail);

		System.out.println("Person 2 Details: ");

		System.out.println("Name: "+p2.name+" Age :"+p2.Age+" Gender: "+p2.Gender+ " Gmail: "+p2.Gmail);

		System.out.println("Person 3 Details: ");

		System.out.println("Name: "+p3.name+" Age :"+p3.Age+" Gender: "+p3.Gender+ " Gmail: "+p3.Gmail);

	}

}

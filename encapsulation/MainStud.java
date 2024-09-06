package encapsulation;

public class MainStud {

	public static void main(String[] args) {
	
		Student s1=new Student();
		s1.setname("Sagar");
		s1.setAge(21);
		s1.setStud_class("A");
		s1.setMarks(85);
		
		Student s2=new Student();
		s2.setname("Rohan");
		s2.setAge(21);
		s2.setStud_class("A");
		s2.setMarks(88);
		
		Student s3=new Student();
		s3.setname("Abhishek");
		s3.setAge(21);
		s3.setStud_class("B");
		s3.setMarks(81);
		
		System.out.println("Student Details 1: ");
		System.out.println("Name: "+s1.getName());
		System.out.println("Age: "+s1.getAge());
		System.out.println("Stud_class: "+s1.getStud_class());
		System.out.println("Marks: "+s1.getMarks());
		System.out.println("--------------------------------");
		
		System.out.println("Student Details 2: ");
		System.out.println("Name: "+s2.getName());
		System.out.println("Age: "+s2.getAge());
		System.out.println("Stud_class: "+s2.getStud_class());
		System.out.println("Marks: "+s2.getMarks());
		System.out.println("--------------------------------");
		
		System.out.println("Student Details 3: ");
		System.out.println("Name: "+s3.getName());
		System.out.println("Age: "+s3.getAge());
		System.out.println("Stud_class: "+s3.getStud_class());
		System.out.println("Marks: "+s3.getMarks());
		

	}

}

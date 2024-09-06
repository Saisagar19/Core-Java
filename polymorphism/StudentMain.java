package polymorphism;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setData("Sagar", 21);
		s1.setData("sagar", 22, "sagar@gmail.com");
		s1.DisplayData();
		System.out.println("-------------------------");
		Student s2 = new Student();
		s2.setData("Sanskar", 21);
		s2.setData("sanskar", 22, "sanskar@gmail.com");
		s2.DisplayData();
		
	}
}

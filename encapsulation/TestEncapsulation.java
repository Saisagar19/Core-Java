package encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		School_Student s=new School_Student();
		s.setAge(22);
		s.setName("Sagar");
		s.setRollNo(21);
		
		System.out.println("Name: "+s.getName());
		System.out.println("Age: "+s.getAge());
		System.out.println("RollNo: "+s.getRollNo());
	}

}

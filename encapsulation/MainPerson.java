package encapsulation;

public class MainPerson {
	public static void main(String[] args) {
		
		ClassPerson p=new ClassPerson();
		p.setAge(21);
		p.setName("Sagar");
		System.out.println("Name: "+p.getName());
		System.out.println("Age: "+p.getAge());
	}

}

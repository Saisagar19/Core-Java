package encapsulation;

public class Student {

	private String name;
	private int age;
	private String Stud_class;
	private int marks;

	public void setname(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;

	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStud_class() {
		return Stud_class;
	}
	public void setStud_class(String stud_class) {
		Stud_class = stud_class;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}


}

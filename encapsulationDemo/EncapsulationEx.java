package encapsulationDemo;

public class EncapsulationEx {

	private String Name;
	private int Id;

	// providing values -- Setter Method
	public void setName(String name) {
		Name = name;
	}

	public void setId(int id) {
		Id = id;
	}

	// fetching data-- getter method
	public String getName() {
		return Name;
	}

	public int getId() {
		return Id;
	}

}

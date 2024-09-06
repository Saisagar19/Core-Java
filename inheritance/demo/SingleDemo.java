package inheritance.demo;

class Vehicle {
	String VehicleType;
}

class car extends Vehicle {
	String ModelName;

	void DisplayData()
	{
		VehicleType ="sedan";
		ModelName="Ferrari";
		System.out.println(VehicleType);
		System.out.println(ModelName);
	}
}

public class SingleDemo {

	public static void main(String[] args) {
		
		car c=new car();
		c.DisplayData();

	}

}

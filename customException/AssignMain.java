package custom;

public class AssignMain {

	public static void main(String[] args) {
		
		Assign1 a= new Assign1();
		
		try {
			
			int division =a.Divide(12, 0);
			System.out.println("Division: "+division);
		}
		catch(DividedByZero e)
		{
			System.out.println(e.getMessage());
		}
	}
}

package polymorphism;

public class Bank_Test {
	public static void main(String[] args) {

		Bank b=new Bank();
		System.out.println(b.getRateOfInterest());

		Bank b1=new SBI_Bank();
		System.out.println(b1.getRateOfInterest());
		Bank b2=new Axis_Bank();
		System.out.println(b2.getRateOfInterest());
		Bank b3=new ICICI_Bank();
		System.out.println(b3.getRateOfInterest());



	}
}

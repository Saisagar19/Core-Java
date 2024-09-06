package encapsulationDemo;

import java.util.Scanner;

public class MyMainClass {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		EncapsulationEx c=new EncapsulationEx();
		System.out.println("Enter name: ");
		String s=sc.next();
		c.setName(s);
		System.out.println("Enter Id: ");
		int i=sc.nextInt();
		c.setId(i);
		
		System.out.println("Deisplay details: ");
		System.out.println(c.getName());
		System.out.println(c.getId());
		
		
	}

}

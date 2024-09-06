package array.demo;

import java.util.Scanner;

public class ClassString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of an String: ");
		int size=sc.nextInt();
		String st[]=new String[size];
		System.out.println("Enter name of a person: ");
		for(int i=0;i<st.length;i++)
		{
			st[i]=sc.next();
			
		}
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
			
		}
		
	}

}

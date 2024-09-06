package control_statements.conditional;

import java.util.Scanner;

public class Month_Selection {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Month of your choice: ");
			
			int month=sc.nextInt();
			
			if(month==1)
			{
				System.out.println("january");
			}
			
			else if(month==2)
			{
				System.out.println("February");
			}
			else if(month==3)
			{
				System.out.println("march");
			}
			else if(month==4)
			{
				System.out.println("April");
			}
			else if(month==5)
			{
				System.out.println("may");
			}
			else if(month==6)
			{
				System.out.println("june");
			}
			else if(month==7)
			{
				System.out.println("jully");
			}
			else if(month==8) {
				System.out.println("august");
			}
			else if(month==9) {
				System.out.println("september");
			}
			else if (month==10){
				System.out.println("octomber");
			}
			else if(month==11) {
				System.out.println("november");
			}
			else if (month==12){
				System.out.println("december");
			}
			else
			{
				System.out.println("Invalid Number for month in year");
			}
		}

	}




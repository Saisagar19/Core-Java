package control_statements.conditional;

import java.util.Scanner;

public class Week_days {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a week day number");

		int week=sc.nextInt();

		switch(week)
		{
		case 1:
		{
			System.out.println("monday");
		}
		break;
		case 2:
		{
			System.out.println("tuesday");
		}
		break;
		case 3:
		{
			System.out.println("Wednesday");
		}
		break;
		case 4:
		{
			System.out.println("thursday");
		}
		break;
		case 5:
		{
			System.out.println("friday");
		}
		break;
		case 6:
		{
			System.out.println("saturday");
		}
		break;
		case 7:
		{
			System.out.println("sunday");
		}
		break;
		default:
		{
			System.out.println("invalid number");
		}
		break;

		}
	}

}

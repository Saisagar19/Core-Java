package control_statements.iterative;

import java.util.Scanner;

public class Table_of_Number {
	
	public void TableLogic()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number To generate table: ");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*num);
		}
	}
	
	
	public static void main(String[] args) {
		
		Table_of_Number t = new Table_of_Number();
		t.TableLogic();
	}

}

package control_statements.conditional;

import java.util.Scanner;

public class Vowel_Switch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character to check wheather it is vowel or consonant");
		
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case 'a':
			System.out.println("vowel");
		break;
		case 'e':
			System.out.println("vowel");
		break;
		case 'i':
			System.out.println("vowel");
		break;
		case 'o':
			System.out.println("vowel");
		break;
		case 'u':
			System.out.println("vowel");
		break;
		default :
			System.out.println("consonant");
		break;
		}
	}
}

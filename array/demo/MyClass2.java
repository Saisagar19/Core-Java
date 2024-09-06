package array.demo;

import java.util.Iterator;
import java.util.Scanner;

public class MyClass2 {
	public static void main(String[] args) {
		
		//1st task
		
		float arr[]=new float[5];
		arr[0]=22.5f;
		arr[1]=55.5f;
		arr[2]=82.5f;
		arr[3]=20.5f;
		arr[4]=72.5f;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		//2nd task---> Usage of Scanner Class
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sizee of an Array: ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		//3rd task
		
		char ch[]=new char[5];
		ch[0]='s';
		ch[1]='a';
		ch[2]='g';
		ch[3]='a';
		ch[4]='r';
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println("----------------------");
		
		//4th task
		
		System.out.println("Enter size of an Array: ");
		int s=sc.nextInt();
		float ft[]=new float[s];
		
		System.out.println("Enter Array elements: ");
		for(int i=0;i<5;i++)
		{
			ft[i]=sc.nextFloat();
		}
		
		for (int i = 0; i < ft.length; i++) {
			System.out.println(ft[i]);
		}
	}

}

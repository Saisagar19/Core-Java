package array.demo;

public class BubbleSort {
	
	void Sort(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	
	void Display(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	void SearchElement(int element ,int a[])
	{
		int flag=0;
		for (int i = 0; i < a.length; i++) {
			if(element==a[i])
			{
				flag=1;
				System.out.println("Index of an element: "+i);
				break;
			}
		
		}
		if(flag==0)
		{
			System.out.println("Element not found");
		}
		
	}
	public static void main(String[] args) {
		int a[] = { 22, 65, 2, 45, 32, 9, 20, 61 };
		
		BubbleSort b=new BubbleSort()	;
		b.Sort(a);
		b.Display(a);
		b.SearchElement(9, a);
		
		
	}
}

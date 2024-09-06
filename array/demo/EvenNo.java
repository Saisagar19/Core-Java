package array.demo;

public class EvenNo {
	public static void main(String[] args) {
		int a[]= {1,8,7,9,5,4,6	};
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}

}

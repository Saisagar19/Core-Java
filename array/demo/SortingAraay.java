package array.demo;

public class SortingAraay {
	public static void main(String[] args) {
		
		int a[]= {22,24,55,12,96,32,44};
		int temp=0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length;j++) {
				
				if(a[j]<a[i])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;	
				}
				
			}
			System.out.println(a[i]);
		}
		
	}

}

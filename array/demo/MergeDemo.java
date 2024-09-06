package array.demo;

import java.util.Iterator;

public class MergeDemo {
	public static void main(String[] args) {
		
		// Merging two arrays with displaying indexes
		int a[]= {2,4,5,9};
		int b[]= {4,5,8,6};
		int merge[]=new int[a.length+b.length];
		
		int index=0;
		for (int i = 0; i < a.length; i++) {
			merge[index]=a[i];
			index++;
		}
		for (int i = 0; i < b.length; i++) {
			merge[index]=b[i];
			index++;	
		}
		
		for (int i = 0; i < merge.length; i++) {
			System.out.println("index: "+i+"--> "+merge[i]);
		}
	}

}

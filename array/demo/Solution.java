package array.demo;

class Solution{
	static int minJump(int arr[], int n){

		int jump=0;
		int gap=0;

		for(int i=0;i<arr.length-1;i++)
		{
			gap=arr[i+1]-arr[i];
			//System.out.println(gap);
			if(gap%2==0 || gap%3==0)
			{
				jump++;
			}
		}
		return jump;
	}
	public static void main(String [] args)
	{
		int arr[]={2,5,7,9};
		System.out.println(Solution.minJump(arr,4));
	}

}

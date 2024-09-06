package custom;

public class Assign1 {
	
	public int Divide(int n,int d) throws DividedByZero
	{
		if(d==0)
		{
			throw new DividedByZero("Denominator is divided by zero");
		}
		return n/d;	
	}


}

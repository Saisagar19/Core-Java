package custom_exception;

public class Assign8 {
	
	public int division(int a,int b) throws DivideByZeroException
	{
		if(b==0)
		{
			throw new DivideByZeroException("Denominator Should Not be zero");
		}
		return a/b;
	}
	
	public int StringLength(String s) throws NullStringException
	{
		if(s==null)
		{
			throw new NullStringException("String Should not be null");
		}
		
		return s.length();
	}

}

package encapsulation;

public class Area {
	int length;
	int breadth;
	
	public Area(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	public void getArea()
	{
		int Area=length*breadth;
		System.out.println("Area: "+Area);
	}

}

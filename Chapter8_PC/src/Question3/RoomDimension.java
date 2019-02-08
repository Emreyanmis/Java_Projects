package Question3;

public class RoomDimension
{
	private double length;
	private double width;
	
	public RoomDimension(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}
	

	public RoomDimension(RoomDimension object2) 
	{
		this.length = object2.length;
		this.width = object2.width;
	}


	public double getArea()
	{
		return length * width;
	}
	
	public String toString()
	{
		return "Length: " + length + "\nWidth: "+ width +"\nArea: " + getArea();
	}
	
	
}

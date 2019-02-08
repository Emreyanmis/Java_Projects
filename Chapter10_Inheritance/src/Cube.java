
public class Cube extends Rectangle
{
	private double height;

	public Cube(double length, double width, double height) 
	{
		super(length, width);
		this.height = height;
	}

	/**
	 * @return the height
	 */
	public double getHeight() 
	{
		return height;
	}
	
	public double getSurfaceArea()
	{
		return getArea() * 6;
	}
	
	public double getVolume()
	{
		return getArea() * height;
	}
}

public class CircleClass
{
   private double radius;
   private double PI = 3.14159;
   
   public CircleClass(double radius)
   {
	   this.radius = radius;
   }
   
   public CircleClass()
   {
	   radius = 0.0;
   }
   

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() 
	{
		return radius;
	}
	
	public double getArea()
	{
		return PI * radius * radius;
	}
	
	public double getDiameter()
	{
	  return radius * 2;	
	}
	
	public double getCircumference()
	{
		return PI * 2 * radius;
	}
   
}


public class Yuh
{
  private double radius;
  
  public Yuh()
  {
	  radius = 1.0;
  }
  
  public double getRadius()
  {
	   return radius;
  }
  
  public void setRadius( double r)
  {
	  radius = r;
  }
  
  public double findArea()
  {
	 return radius * radius * Math.PI;  
  }
  
}

public class Yaprak extends Yuh
{
  private double height;
  
  public Yaprak()
  {
	  super();
	  height = 1.0;
  }
  
  public double getHeight()
  {
	  return height;
  }
  
  public void setHeight( double h)
  {
	  height = h;
  }
  
  public double findVolume()
  {
	  return findArea() * height;
  }
}
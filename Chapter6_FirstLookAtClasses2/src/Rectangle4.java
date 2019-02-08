
public class Rectangle4 
{
   private double length;
   private double width;
   
   /**
    * Constructor
    * @param len The length of the rectangle
    * @param w The width of the rectangle
    */
   
   public Rectangle4(double len, double w)
   {
	   length = len;
	   width = w;
   }
   
   public void setLength(double len)
   {
	   length = len;
   }
   
   public void setWidth(double w)
   {
	   width = w;
   }
   
   public double getLength()
   {
	   return length;
   }
   
   public double getWidth()
   {
	   return width;
   }
   
   public double getArea()
   {
	   return width * length;
   }
}

public class Rectangle3
{
   private double length;
   private double width;
   
   public void setLength(double len)
   {
	   length = len;
   }
   
   public void setWidth(double we)
   {
	   width = we;
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
	   return length * width;
   }
}
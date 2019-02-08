package Question9;

public class Geometry 
{
   public static double areaCircle(double radius)
   {
	   if( radius < 0)
		   return -1;
	   
	   double area;
	   
	   area = Math.PI * Math.pow(radius, 2);
	   return radius;   
   }
   
   public static double areaRectangle(double length, double width)
   {
	   if(length < 0|| width < 0)
		   return -1;
	   
	   double area;
	   
	   area = length * width;
	   return area;
   }
   
   public static double areaTriangle(double base, double height)
   {
	   if(base < 0|| height < 0)
		   return -1;
	   
	   double area;
	   
	   area = base * height  * 0.5;
	   return area;
   }
}

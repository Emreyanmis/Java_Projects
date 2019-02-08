package Question1;

public class Area 
{
   
   
	   public static double find(double radius)
	   {
		   double area;
		   
		   area = Math.PI * Math.pow(radius, 2);
		   
		   return area;
	   }
   
	   public static double find(double width, double length)
	   {
		   double area;
		   
		   area = width * length;
		   
		   return area;
	   }
   
	   public static double find(float radius, double height)
	   {
		   double area;
		   
		   area = Math.PI * height * Math.pow(radius, 2);
		   
		   return area;
	   }
   
}

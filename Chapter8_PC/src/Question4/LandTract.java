package Question4;

public class LandTract 
{
   private double length;
   private double width;
   
   
   public LandTract(double length, double width)
   {
	   this.length = length;
	   this.width = width;
   }
   public double getArea()
   {
	   return length * width;
   }
   
   public boolean equals(LandTract object2)
   {
	   boolean status;
	   
	   if(this.getArea() == object2.getArea())
		   	status = true;
	   else
		   status = false;
	   
	   return status;
   }
   
   public String toString()
   {
	   return "Length: " + length + "\nWidth: " + width + "\nArea: " + getArea();
   }
   
}

package Static_Class_Members_8_1;

public class Countable 
{
   private static int instanceCount = 0;
   
   public Countable()
   {
	   instanceCount++;
   }
   
   public int getInstanceCount()
   {
	   return instanceCount;
   }
}

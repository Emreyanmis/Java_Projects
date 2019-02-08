package Static_Class_Members_8_1;

public class Countable1 
{
	private  int instanceCount = 0;
	   
	   public Countable1()
	   {
		   instanceCount++;
	   }
	   
	   public int getInstanceCount()
	   {
		   return instanceCount;
	   }
}


public class Array2 
{

	public static void main(String[] args) 
	{
	   int [] a = {1,2,3};
	   
	   int sum = 0;
	   
	   for(int i=0; i <a.length; i++)
	   {
		   if(i % 2 ==0)
		   {
			   sum += a[i];
		   }   
	   }   
	     System.out.println("Sum: "+ sum);
      
	}
}

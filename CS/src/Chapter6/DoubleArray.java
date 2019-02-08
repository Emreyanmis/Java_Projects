package Chapter6;

public class DoubleArray 
{

	public static void main(String[] args)
	{
		int [] a = {1, 2, 3} ;
		System.out.println("Original Array: ");
		printArray(a);
		doubleArray(a);
		System.out.println("Doubled Array: ");
		doubleArray(a);
	}
	
	 public static  void doubleArray( int[] c)
	  {  
	      for(int i = 0; i< c.length; i++)
 	      {
 	         c [i] *=2 ;
 	      }
	  } 
	

	public static void printArray( int [] b) // int [] b equals to printArray(a), which is {1,2,3}.
	{
	   for(int i = 0 ;i < b.length; i++) // length is a number of elements in an array group.
	   {
	       System.out.println( b [i] +" ");
	   }
	}   
}	

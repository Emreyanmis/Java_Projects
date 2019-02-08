public class Question6<T extends Comparable<T>> 
{
     T[] array;
     
     public Question6(T[] arr)
     {
    	   array = arr;
     }
     
     public T highest()
     {
    	    T high = array[0];
    	    
    	    for(int i = 0; i < array.length;i++)
    	    {
    	    	   if(high.compareTo(array[i]) < 0)
    	    		   high = array[i];  	    	
    	    }
    	    
    	    return high;  	 
     }
     
     
     public T lowest()
     {
    	   T low = array[0];
    	   
    	   for(int i = 0; i < array.length; i++)
    	   {
    		   if(low.compareTo(array[i]) > 0)
    		   {
    			   low = array[i];
    		   }
    	   }
    	   
    	   return low;
     }
     
}

public class Question3 
{

	public static void main(String[] args) 
	{
	    String[] scientists = {"Einstein","Newton","Copernicus","Kepler"};
	    
	    System.out.println("The scientists are:");
	    
	    for(int i = 0; i < scientists.length; i++)
	    	   System.out.print(scientists[i] + " ");
       
	    System.out.println();
	    int total = 0;
	    
	    for(int i = 0; i < scientists.length; i++)
	    	   total = i + 1;
	    
	    // Display the total length of the array
	    System.out.print("The total length of the array is: " + total);
	    
	}

}

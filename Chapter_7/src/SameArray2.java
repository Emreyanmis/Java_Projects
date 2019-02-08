/**
 * This program demonstrates that two variables can 
 * reference the same array.
 * @author emreyanmis
 */
public class SameArray2 
{

	public static void main(String[] args) 
	{
	   int [] array1 = {2, 4, 6, 8, 10 };
	   int [] array2 = new int[5];
	   
	  
	   for (int i = 0 ; i < array1.length; i++)
	   {
		     array2[i] = array1[i];
	   }
		
	   // Change one of the elements using array2.
	   array2[3] = 76;
	   

	   // Display all the elements using array1.
	   System.out.println("The contents of array2: ");
	   for(int i = 0; i < array2.length; i++)
		   System.out.println(array2[i] + " ");
	   
	}

}


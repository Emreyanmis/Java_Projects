/**
 * This program uses an invalid subscript with an array
 * @author emreyanmis
 *
 */
public class InvalidSubscript 
{

	public static void main(String[] args) 
	{
	   int [] values = new int[3];  // an array with 3 elements
	   
	   System.out.println("I will attempt to store four numbers" +
	                      "in a three-element array");
	   
	   for(int index = 0; index < 4; index++)
	   {
		   System.out.println("Now processing element " +  index);
		   values[index] = 10;  // every element in the array has a value of 10.
	   }  
	}

}

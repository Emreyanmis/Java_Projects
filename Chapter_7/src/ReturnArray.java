/**
 * This program demonstrates how a reference to an
 * array can be returned from a method.
 * @author emreyanmis
 */
public class ReturnArray 
{

	public static void main(String[] args)
	{
	   double[] values;
	   
	   values = getArray();
	   for(double i : values)
		   System.out.print(i + " ");   
	}
	
	/**
	 * getArray method
	 * @return A reference to an array of doubles.
	 */

	private static double[] getArray() 
	{
		double[] array = { 1.2, 2.3, 4.5, 6.7, 8.9};
		
		return array;
	}
}

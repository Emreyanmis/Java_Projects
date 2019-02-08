/**
 * This program demonstrates a value-returning method.
 * @author emreyanmis
 */
public class ValueReturn 
{

	public static void main(String[] args)
	{
		 int total, value1 = 20, value2 = 40;
	     
		 total = sum(value1, value2);
		 
		 System.out.println("The sum of " + value1 + " and " + value2 + " is " + total);
	}
	
	/**
	 * The sum method returns the sum of its two parameters
	 * @param num1 The first number to be added
	 * @param num2 The second number to be added
	 * @return The sum of num1 and num2
	 */
	
	public static int sum(int num1, int num2)
	{
		int result;  // result is a local varible
		
		result = num1 + num2;
		
		return result;
	}
}

/**
 * This class has a recursive method
 * @author emreyanmis
 */

public class EndlessRecursion 
{
   public static void message(int n)
   {
	   System.out.println("This is a recursive method.");
	   message(n);
   }   
}

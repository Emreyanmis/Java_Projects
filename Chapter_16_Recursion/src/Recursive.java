/**
 * This calss has recursive method, message, which displays a message n times
 * @author emreyanmis
 */
public class Recursive 
{
    public static void message(int n)
    {
        if(n > 0)
        {
        	   System.out.println("This is a recursive method.");
        	   message(n-1);
        }
    }
}

import java.util.Scanner;

public class Question2
{
   public static void main(String[] arg)
   {
	   Scanner keyboard = new Scanner(System.in);
	   
	   String str;
	   System.out.print("Enter you name:");
	   str = keyboard.nextLine();
	   
	   System.out.print("Your name in reverse order is: ");
	   inReverseOrder(str, str.length()-1);
   }
   
   public static void inReverseOrder(String n, int j)
   {
	   if(j >= 0)
	   {
		   System.out.print(n.charAt(j));
		   inReverseOrder(n, j- 1);
	   }
	   
   }
   
}

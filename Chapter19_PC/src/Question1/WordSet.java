package Question1;


import java.util.Scanner;
import java.util.*;
public class WordSet 
{

	public static void main(String[] args)
	{
	   Scanner keybaord  = new Scanner(System.in);
	   String input;
	   
	   SortedSet<String> myList = new TreeSet<String>();
	   
	   System.out.println("Enter the data: ");
	   input = keybaord.nextLine();
	   
	   StringTokenizer st = new StringTokenizer(input);
	   
	   while(st.hasMoreTokens())
	   {
		   myList.add(st.nextToken());
	   }
	   
	   System.out.print("\nHere are the sorted objects: \n[");
	   
	   for(String c: myList)
		   System.out.print(c + " ");
	   System.out.print("]");
	}

}

import java.util.ArrayList;    // Needed for ArrayList class

/**
 * This program demonstrates inserting an item
 * @author emreyanmis
 */

public class ArrayListDemo5 
{
   public static void main(String[] args)
   {
	   // Create an ArrayList to hold some names.
	   ArrayList<String> nameList = new ArrayList<String>();
	   
	   // Add some names to the ArrayList.
	   nameList.add("James");
	   nameList.add("Catherine");
	   nameList.add("Bill");
	   
	   // Display the items in nameList and their indices.
	   for(int i = 0; i < nameList.size(); i++)
	   {
		  System.out.println("Index: " + i + " Name: " + nameList.get(i)); 
	   }
	   
	   // Now insert an item index 1.
	   nameList.add(1," Mary ");
	   
	   System.out.println();
	   System.out.println("Mary was added at index 1. Here are the items now. ");
	   for(int i = 0; i < nameList.size();i++)
	   {
		   System.out.println("Index: " + i + " Name: " + nameList.get(i)); 
	   }
   }
}
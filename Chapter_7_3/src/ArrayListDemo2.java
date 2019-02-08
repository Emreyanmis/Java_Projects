import java.util.ArrayList;

/**
 * This program demonstrates an ArrayList
 * using the Enhanced for Loop with an ArrayList
 * @author emreyanmis
 *
 */
public class ArrayListDemo2
{
  public static void main(String[] args)
  {
	  // Create an ArrayList to hold some names.
	  ArrayList<String> nameList = new ArrayList<String>();
	  
	 // Add some names to the ArrayList
	  nameList.add("James");
	  nameList.add("Catherine");
	  nameList.add("Bill");
	  
	  // Display the size of the ArrayList.
	  System.out.println("The ArrayList has " + nameList.size() + " objects stored in it.");
	  
	  // Now display the item in nameList.
	  for(String name : nameList)
		  System.out.println(name);
  }
}

import java.util.ArrayList;

/**
 * This program demonstrates an ArrayList.
 * @author emreyanmis
 *
 */
public class ArrayListDemo1 
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
	  for(int i = 0; i  < nameList.size(); i++)
		  System.out.println(nameList.get(i));
  }
}

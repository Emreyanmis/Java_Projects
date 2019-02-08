package Question2;

import java.util.*;
import java.util.Scanner;
public class EmployeeMap 
{

	public static void main(String[] args) 
	{
	   Scanner keyboard = new Scanner(System.in);	
	   String str;
	   Map<String, Employee> myList = new HashMap<>();
	   
	   Employee person1  = new Employee("GF3432IO", "jack");
	   Employee person2 = new Employee("OU9340HG", "emily");
	   Employee person3  = new Employee("F53762KL", "ryan");
	   Employee person4  = new Employee("NH6536SD", "emre");
	   Employee person5  = new Employee("GL5152PL", "dan");
       
	   myList.put(person1.getID_number(), person1);
	   myList.put(person2.getID_number(), person2);
	   myList.put(person3.getID_number(), person3);
	   myList.put(person4.getID_number(), person4);
	   myList.put(person5.getID_number(), person5);

	   
	    System.out.println("Searching for ID Number: " + person1.getID_number());
        Employee personX  = myList.get(person1.getID_number());
        
        if(personX != null)
        {	
        	System.out.println("ID Number: " + person1.getID_number() + " has been found");
        	System.out.println("Here is employee's other information: ");
        	System.out.println(personX);
        }	
        else
        	System.out.println("ID Number: " + person1.getID_number() + " has NOT been found");
	   
	   
        
	    System.out.print("\nSearch for ID Number:" );
	    str = keyboard.nextLine();
        Employee personY = myList.get(str);
        
        if(personY != null)
        {	
        	System.out.println("ID Number: " + str + " has been found");
    		System.out.println("Here is employee's other information: ");
    		System.out.println(personY);
        }	
        else
        	System.out.println("ID Number: "+ str + " has NOT been found");
        
        
        
       System.out.println("\n\nHere is the other information about other employees:\n");
       Set<Map.Entry<String, Employee>> employees = myList.entrySet();
 	   
 	   for(Map.Entry<String, Employee> c: employees)
 	   {
 		   System.out.println("Key = "  + c.getKey());
 		   System.out.println("Value = " + c.getValue());
 		  System.out.println();
 	   }   
        
	}

}

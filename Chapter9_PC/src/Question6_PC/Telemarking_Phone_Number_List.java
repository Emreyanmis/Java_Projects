package Question6_PC;


import java.util.Scanner;
public class Telemarking_Phone_Number_List 
{
	
   public static void main(String[] args)
   {
	   Scanner keyboard = new Scanner(System.in);
	   String input;
	   
		String[] name = {"Harrison, Rose", "James, Jean", "Smith, Willian", "Smith, Brad"};
		
		String[] phone = {"555-2234", "555-9098", "555-1785", "555-9224"};
	   
		 System.out.print("Enter the first few characters of the last name to "
		 		+ "look up: ");
		 input  = keyboard.nextLine();
		
		 
		 System.out.println("Here are the names that match:");
		 for(int i = 0; i < name.length; i++)
		 {
			  if(name[i].startsWith(input))
				 {
					 System.out.println(name[i] + " : " + phone[i]);
				 }
			 
			
		 }
	
	
   }
}

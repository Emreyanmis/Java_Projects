package Question17;

import java.util.ArrayList;
public class PhoneBookEntryDemo 
{

	public static void main(String[] args) 
	{
		// Create an ArrayList to hold PhoneBookEntry objects.
		ArrayList<PhoneBookEntry> demo = new ArrayList<PhoneBookEntry>();
		
		// Add five PhoneBookEntry objects to the ArrayList
		demo.add(new PhoneBookEntry("Emre", 2343243));
		demo.add(new PhoneBookEntry("Jacop",3243432));
		demo.add(new PhoneBookEntry("Murat", 4543526));
		demo.add(new PhoneBookEntry("Halil", 5463655));
		demo.add(new PhoneBookEntry("Agah",  8923423));
       
		// Display each item
		for(int i = 0; i < demo.size(); i++)
		{	
			PhoneBookEntry phone = demo.get(i);
			System.out.println("Person's name: " + phone.getName() +
					           "\nPerson's phone number: " + phone.getNumber() +"\n");
		}
	}

}

import java.util.ArrayList;

public class ArrrayListRemove
{

	public static void main(String[] args)
	{
		ArrayList<String> nameList = new ArrayList<String>();
        
		nameList.add("Emre");
        nameList.add("Mert");
        nameList.add("Sevde");
        
         System.out.println("Here is  the ArrrayList object content: ");
         for(int i = 0; i < nameList.size(); i++)
         {
        	    System.out.println(nameList.get(i));
         }
        
         nameList.remove(0);
         System.out.println();
         
         System.out.println("Here is new the ArrrayList object content: ");
         for(int i = 0; i < nameList.size(); i++)
         {
        	    System.out.println(nameList.get(i));
         } 
	}

}

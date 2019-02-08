
public class ArrayString1 
{

	public static void main(String[] args) 
	{
		String[] names = new String[2];
		
		names[0] = "emre ";
		names[1] = "halis";
		
		
		for(int i = 0; i < names.length; i++)
			System.out.println(names[i].toUpperCase());
		
		System.out.println("============");
		
        String[] surNames = new String[2];
		
        surNames[0] = "SENLILER";
        surNames[1] = "YANMIS";
		
		for(int i = 0; i < surNames.length; i++)
			System.out.println(surNames[i].toLowerCase());
       
	}

}

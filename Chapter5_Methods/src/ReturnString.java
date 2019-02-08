
public class ReturnString
{

	public static void main(String[] args) 
	{
		String customerName;
		
		customerName = customer("Emre", "Yanmis");
		System.out.println(customerName);
	}
	
	public static String customer(String first , String last)
	{
		String name;
		
		name = first + " " + last;
		
		return name;
	}

}

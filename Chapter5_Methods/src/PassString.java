
public class PassString 
{

	public static void main(String[] args) 
	{
	  String name = "emre";
	  
	  System.out.println("In main, the name is " + name);
	  
	  changeName(name);
	  
	  System.out.println("Back in main, the name is " + name);
	}
	
	public static void changeName(String str)
	{
	   str = "halis";
	   
	   System.out.println("In changeMe, the name is now " + str);
	}

}

package Checkpoint_9_2;

public class CheckPoint_9_3 
{

	public static void main(String[] args) 
	{

		 String name = "Emreger";
		 boolean status;
		 
		 status = endsWith(name);
	  
		 System.out.println(status);
				 
		 
		 String cafeName = "Broadway Cafe";
		 String str;
		 
		 str = cafeName.substring(0, 9);
		 System.out.println(str);
		 
		 
		double number = 9.47;
		String str3;
		
		str3 = String.valueOf(number);
		
		System.out.println(str3);
		
		
		String name1;
		name1 = "emre";
		name1 = "yako";
		
		System.out.println(name1);
	}
	
	public static boolean endsWith(String str)
	{
		
		 boolean status;
		 
	     if(str.endsWith("ger"))
	    	 status = true;
	     else 
	    	 status = false;
	    
		 return status;
		
	}

}

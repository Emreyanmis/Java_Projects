package FindError;

public class Question1 
{

	public static void main(String[] args) 
	{
		int number = 99;
		
		String str;
		
	    str = String.valueOf(number);
	    
	    System.out.println(str);
	    
	    String s = "90";
	    
	    int n;
	    n = Integer.parseInt(s);
	    
	    
	    System.out.println(s);
	    
	    
	    String str1 = "one;two;three";
	    String[] tokens = str1.split(";");
	    
	    for(String s1: tokens)
	    	System.out.println(s1);
		
       
	}

}

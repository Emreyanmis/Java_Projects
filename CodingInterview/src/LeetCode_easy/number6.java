package LeetCode_easy;

public class number6 
{
	 public static void main(String[] args)
	 {
		 String str = "Hello World Emre sdgsfgs ";
		 System.out.println(lengthOfLastWord2(str));
	 }
	
	    public static int lengthOfLastWord(String s) 
	    {
	    	String[] word = s.split(" ");
	    	
	    	if(word.length <= 1)
	    			return 0;
	    	char[] ch = word[word.length - 1].toCharArray();
	    	int length = ch.length;
	    
	    	return length;
	        
	    }
	    
	    public static int lengthOfLastWord2(String s) 
	    {
	    	
	    	 System.out.println(s.trim()+ "");
	    	 System.out.println(s.trim().lastIndexOf(" "));
	    	 return s.trim().length() - s.trim().lastIndexOf(" ")-1 ;
	        
	    }
	
}

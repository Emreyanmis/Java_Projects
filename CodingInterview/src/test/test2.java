package test;

public class test2 {

	public static void main(String[] args) 
	{
		
		String[] array = {"flower","flow","flight"};
		
		System.out.println(longestCommonPrefix(array));

	}
	
    public static String longestCommonPrefix(String[] strs) 
    {
    	String prefix  = strs[0];
    	
    	if(strs.length == 0)
    		return "";
    	
    	System.out.println(strs[1].indexOf("fl"));
    	
    	return prefix;

	}

}

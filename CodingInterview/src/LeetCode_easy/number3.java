package LeetCode_easy;


public class number3 
{
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
    	
    	for(int i = 1; i < strs.length; i++)
    	{
    		while(strs[i].indexOf(prefix) != 0)
    		{	
    			prefix = prefix.substring(0, prefix.length() -1);
    			System.out.println(prefix);
    		}
    		if(prefix.isEmpty())
    			return "";
    			
    	}
    	
    	return prefix;
        
    }
	
}

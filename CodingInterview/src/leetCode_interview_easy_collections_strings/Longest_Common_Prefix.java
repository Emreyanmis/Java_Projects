package leetCode_interview_easy_collections_strings;

public class Longest_Common_Prefix {
	public static void main(String[] args) {
		String[] st = {"flower","flow","flight"};
		longestCommonPrefix(st);

	}
	 public static String longestCommonPrefix(String[] strs) 
	    {   
	        if(strs.length == 0)
	            return "";
	        
	        String common = strs[0];
	        
	        for(int i = 1; i < strs.length; i++) {
	            while(strs[i].indexOf(common) != 0) {   
	            		 System.out.println("array["+i +"]: "+ strs[i] + " ,common: " + common);
	                     common = common.substring(0, common.length() -1);
	                     System.out.println(strs[i].indexOf(common));
	                     System.out.println("common: " + common + "\n\n");
	            }        
	            if(common.isEmpty())
	                return "";
	        }
	        
	        return common;
	    }

}

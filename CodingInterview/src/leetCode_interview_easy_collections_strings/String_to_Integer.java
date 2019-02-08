package leetCode_interview_easy_collections_strings;

public class String_to_Integer {

	public static void main(String[] args) {
		String s = "     3000000000000000000000000000000000";
		System.out.println(myAtoi(s));

	}
	public static int myAtoi(String str) {
	       StringBuilder result = new StringBuilder();
	       String result2;
	       long val;

	       for(int i = 0; i< str.length(); i++) {
	    	   
	    	   if(Character.isDigit(str.charAt(i)) || str.charAt(i) == '-')
	    		   result.append(str.charAt(i));
	       }
	       
	       result2 = result.toString();
	       val = Long.valueOf(result2);          
	       
	       if(val > Integer.MAX_VALUE)
	    	   return Integer.MAX_VALUE;
	       else if(val < Integer.MIN_VALUE)
	    	   return Integer.MIN_VALUE;
	       else {
	    	   int val2 = (int) val;
	    	   return val2;
	       }
	 }
}

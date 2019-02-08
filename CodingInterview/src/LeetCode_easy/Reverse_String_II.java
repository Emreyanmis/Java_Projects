package LeetCode_easy;

public class Reverse_String_II {

	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 4;
		System.out.println( 0 % 2);
		System.out.println(reverseStr2(s,k));
	}
	
	 public static String reverseStr(String s, int k) 
	 {
		  char[] ch = new char[s.length()];
		  
		 
	     for(int i = 0; i < k; i++){
	    	 ch[i] = s.charAt(k - (i + 1));
	    	 System.out.println(ch[i]);
	     }
	     
	     for(int i = k; i < s.length(); i++) {
	    	 ch[i] = s.charAt(i);
	    	 System.out.println(ch[i]);
	     }
	     
	     String b = new String(ch);
	     
	    
	   return b;
	 }
	 
	 public static String reverseStr2(String s, int k) {
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i = 0; i < s.length() ;i++ ){
	            if((i/k) % 2 == 0){
	            	System.out.println(sb.length()-i%k);
	                sb.insert(sb.length()- (i % k),s.charAt(i));
	                System.out.println(sb);
	            }else{
	                sb.append(s.charAt(i));
	                System.out.println(sb);
	            }
	        }
	        return sb.toString();
	    }

}

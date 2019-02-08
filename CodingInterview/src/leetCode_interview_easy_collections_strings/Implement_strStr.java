package leetCode_interview_easy_collections_strings;

public class Implement_strStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "hello";
		String needle = "ll";
		System.out.println(strStr(haystack, needle));

	}
	 public static int strStr(String haystack, String needle) {
		 for (int i = 0; ; i++) {
			 System.out.println("i: " + i);
			    for (int j = 0; ; j++) {
			    	System.out.println("i: " + i +". j:" + j );
			      if (j == needle.length())
			    	  return i;
			      if (i + j == haystack.length())
			    	  return -1;
			      if (needle.charAt(j) != haystack.charAt(i + j))
			    	  break;
			       }
		 }
    }
}

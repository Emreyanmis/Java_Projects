package leetCode_interview_easy_collections_strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String s1 ="Hannah";
		System.out.print(reverseString(s1));
		reverseString(s);
		
	}
	public static String reverseString(String s) {
	    char[] ch = s.toCharArray();
	    char temp;
	    int n = ch.length - 1;
	    for(int i = 0; i < (ch.length /2); i++, n--) {
	    	temp = ch[i];
	    	ch[i] = ch[n];
	    	ch[n] = temp;
	    }
		return new String(ch);
    }
	

}

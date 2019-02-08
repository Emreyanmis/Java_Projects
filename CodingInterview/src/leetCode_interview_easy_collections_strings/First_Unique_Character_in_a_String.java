package leetCode_interview_easy_collections_strings;

import java.util.ArrayList;

public class First_Unique_Character_in_a_String {
	
	public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));	
	}

	public static int firstUniqChar(String s) {
		int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++) {
        	System.out.println("#: " + i + ": " + s.charAt(i));
        	System.out.println(s.charAt(i) - 'a');
        	System.out.println(freq [s.charAt(i) - 'a'] );
            freq [s.charAt(i) - 'a'] ++;
            System.out.println(freq [s.charAt(i) - 'a']+ "\n" );
        }  
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
	} 
}


package Tokenizing_Strings_9_5;

public class CheckPoint1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "/home/rjones/mydata.txt;tel";
		
		String[] tokens = str1.split("[/.;]");
		
		for(String s: tokens)
			System.out.println(s);
		System.out.println("====================");
		
		String str2 = "dog$cat@bird%squirrel";
		
		String[] tokens1 = str2.split("[%@$]");
		
		for(String s: tokens1)
			System.out.println(s);
		
	    
	}

}

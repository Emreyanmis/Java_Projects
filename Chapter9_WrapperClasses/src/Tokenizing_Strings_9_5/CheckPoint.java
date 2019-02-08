package Tokenizing_Strings_9_5;

public class CheckPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "one two three four";
		
		String[] tokens = str.split(",");
		
		int x = tokens.length;
		
		String first = tokens[0];
		
		System.out.println(x + "\n" + first);
	

	}

}

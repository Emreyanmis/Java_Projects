package Chapter1;

public class checkPermutation 
{

	public static void main(String[] args) 
	{
		String str1 = "emre";
		String str2  = "erme";
		boolean result;
		
	    result = isPermutation(str1,str2);
		
	    System.out.println("Are the String' s permutations same? " + result);

	}
	
	static String sort(String s)
	{
	   char[] content = s.toCharArray();
	   java.util.Arrays.sort(content);
	   return new String(content);   
	}
	static boolean isPermutation(String s, String t)
	{
		if(s.length() != t.length())
			return false;
		else
			return sort(s).equals(sort(t));
	}

}

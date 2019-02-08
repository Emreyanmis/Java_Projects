package StringBuilder_Class_9_4;


/**
 * The telephone class provides static methods for formating and unformatting the 
 * US telephone numbers
 * @author emreyanmis
 */
public class Telephone 
{ 
   public final static int formattedLength = 13;
   public final static int unformattedLength = 10;
   
   
   public static boolean isFormatted(String str)
   {
	   boolean valid;
	   
	   if(str.length() == formattedLength && str.charAt(0) == '(' && str.charAt(4) == ')' &&
		  str.charAt(8) == '-')
		  valid = true;
	   else
		   valid = false;
	   
	   return valid;
   }
   
   public static String unformat(String str)
   {
	  StringBuilder strb = new StringBuilder(str);
	  
	  //If the argument is properly formatted, then unformat it.
	  if(isFormatted(str))
	  {
		  // First, delete the left paren at position 0.
		  strb.deleteCharAt(0);
		  
		  // Next, delete the right paren.Because of the previous deletion it is now
		  // located at position 3.
		  strb.deleteCharAt(3);
		  
		  // Next, delete the hypen.Because of the previous deletions it is now located 
		  // at position 6.
		  strb.deleteCharAt(6);
	  }	  
	  
	  return strb.toString();	   
   }
   
   public static String format(String str)
   {
	   StringBuilder strb = new StringBuilder(str);
	   
	   
	   // If the argument is the correct length, then format it
	   if(str.length() == unformattedLength)
	   {
		   // First, insert the left paren at position 0.
		   strb.insert(0, "(");
		   
		   // Next, insert the right paren at position 4.
		   strb.insert(4, ")");
		   
		   // Next, insert the hyphen at position 8.
		   strb.insert(8, "-");
		   
	   }
	   
	   return strb.toString();
	   
   }
}

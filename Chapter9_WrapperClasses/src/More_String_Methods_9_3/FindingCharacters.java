package More_String_Methods_9_3;

public class FindingCharacters
{

	public static void main(String[] args)
	{
	    String str = "4!23gf!gr!3g!fgfdg!dfsg!g4g45!";
	    int position;
	    
	    
	    System.out.println("The unique character ! appears at the following locations: ");
	    position = str.indexOf('!');
	    while(position != -1)
	    {
	    	System.out.println(position);
	    	position = str.indexOf('!', position + 1);
	    }
	    
	    

	}

}

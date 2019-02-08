
public class Question1 
{
	public static void main(String[] args)
	{
        int[] names = new int[20];
        
        for(int i = 0; i < names.length;i++)
        {
        	   names[i] = i + 1;
        }
        
        System.out.println("The array is as follows:");
        
        for(int i = 0; i < names.length;i++)
        {
        	  System.out.print(names[i] + " ");
        }
        
	}

}

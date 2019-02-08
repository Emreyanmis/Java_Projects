
public class Question5 
{

	public static void main(String[] args) 
	{
         int x = 10;
         
         for(int i = x; i <= 10; i-- )
         {
        	    System.out.print(i +" + ");
         }
         
         System.out.println(myMethod(x));		
	}
	
	public static int myMethod(int num)
	{
		if(num <= 0)
			return 0;
		else
			return num + myMethod(num -1);
	}

}

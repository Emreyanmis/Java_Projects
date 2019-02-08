import java.util.ArrayList;

public class PositiveNegative 
{

	public static void main(String[] args)
	{
	   ArrayList<Integer> list = new ArrayList<Integer>();
	   list.add(3);
	   list.add(-5);
	   list.add(10);
	   list.add(-10);
	   list.add(13);
	   
	   int numNeg = 0;
	   
	   for(int i = 0; i < list.size(); i++)
	   {
		   if(list.get(i) < 0 )
		   {
			   numNeg++;
		   }   
		   
	   }   
         System.out.println(numNeg); //2
	}

}

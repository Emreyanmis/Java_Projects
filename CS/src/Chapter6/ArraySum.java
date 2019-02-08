package Chapter6;

public class ArraySum 
{

	public static void main(String[] args) 
	{
		
		int [][] a = { {899,6435,53568,65,543}, {32,43,65,76,34} };
		
		int sum = 0;
		int avg =0;
		
		for(int[] i : a) // each row
		{
			for(int j:i) // each column
			{
				sum += j;
			}
			
		}
		avg = (int) (sum / (a.length + a[1].length));
		
        System.out.println(sum);
        System.out.println(avg);
	}

}

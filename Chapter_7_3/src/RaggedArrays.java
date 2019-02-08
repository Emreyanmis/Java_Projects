
public class RaggedArrays 
{

	public static void main(String[] args) 
	{
		int[][] ragged = new int[4][];
        
		ragged[0] = new int[3];     // Row 0 has 3 columns
		ragged[1] = new int[4];     // Row 1 has 4 columns
		ragged[2] = new int[5];     // Row 2 has 5 columns
		ragged[3] = new int[6];     // Row 3 has 6 columns
		
		for(int i = 0; i < ragged.length; i++)
		{
			System.out.println("The number of columns in the row " + i + " is " + ragged[i].length);
		}	
		
	}
}

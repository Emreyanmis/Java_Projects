
public class Array1 
{
	public static void main(String[] args)
	{
		int [] myarr = new int [10];
		
		for (int i=0; i<myarr.length;i++)
		{
			myarr[i] =i+1;
		}	
		for(int i=0; i<myarr.length;i++)
		{
			System.out.print(myarr[i]);
		}	
	}
	
}

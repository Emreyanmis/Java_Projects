
public class Array3 
{
  public static void main(String[] args)
  {
	  int [][] a = new int [2][2];
	 
	  
	  for(int i=0; i <a.length;i++)
	  {
		  for(int j=0; j<a[i].length;j++)
		  {
			  a[i][j]= (int)(Math.random());
			  System.out.print(a[i] );
			  System.out.print(a[j] );
					  
		  }	   
	  }	  
  } 
}

package Chapter6;

public class MaxElement
{

	public static void main(String[] args)
	{
	  int [] a = {0,4,5,45,43,64,0,143} ;
	  
	  int maxValue = a[0];
	  for(int i= 0 ; i <a.length; i++)
	  {
		 if(a[i]>maxValue)
		 {
			maxValue= a[i]; //new max value
		 }
	  }	 
		 System.out.println(maxValue); 
	   
	}

}

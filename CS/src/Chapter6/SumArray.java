package Chapter6;

public class SumArray 
{
  public static void main(String[] args)
  {
	  int[] a = {3,5,6,8,8,10,22};
	  int sum = 0 ;
      double avg= 0;
      
      for(int n : a)
      {
        sum = n;    	  
      }
      
      avg = (double) sum / a.length;
      
      System.out.println("Sum: "+ sum);
      System.out.println("Average: "+avg);
  }
}

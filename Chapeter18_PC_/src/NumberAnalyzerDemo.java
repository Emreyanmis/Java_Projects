
public class NumberAnalyzerDemo 
{

	public static void main(String[] args) 
	{
	  Integer[] integers = {23, 2, 232, 23423};
	  
	  Double[] doubles = {432.342 , 23432.43 , 90.23, 94.0};
	  
	  NumberAnalyzer<Integer> na1 = new NumberAnalyzer<Integer>(integers);
	  NumberAnalyzer<Double> na2 = new NumberAnalyzer<Double>(doubles);
	  
	  System.out.println("Elements in the integers array: ");
	  
	  for(int i = 0; i < integers.length; i++)
	  {
		  System.out.print(integers[i] + " ");
	  }
	  
	  int ih = na1.highest();
	  System.out.println("The highest value in the integers array: " + ih);
	  
	  int il = na1.lowest();
	  System.out.println("The lowest value in the integers array: " + il);
	  
	  int itotal = (int)na1.sum();
	  System.out.println("The sum of values in the integers array: " + itotal);
	  
	  double iavg = na1.average();
	  System.out.println("The average value in the integers array: " + iavg);
	  
	  
	  
	  
	  
	  System.out.println("Elements in the doubles array: ");
	  
	  for(int i = 0; i < integers.length; i++)
	  {
		  System.out.print(doubles[i] + " ");
	  }
	  
	  double ih1 = na2.highest();
	  System.out.println("The highest value in the doubles array: " + ih1);
	  
	  double il1 = na2.lowest();
	  System.out.println("The lowest value in the doubles array: " + il1);
	  
	  double itotal1 = (double)na2.sum();
	  System.out.println("The sum of values in the doubles array: " + itotal1);
	  
	  double iavg1 = na2.average();
	  System.out.println("The average value in the doubles array: " + iavg1);
	 
	}

}

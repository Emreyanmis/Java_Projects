
public class maxElementMethod 
{

	public static void main(String[] args) 
	{
		int[] numbers = { 90,20, 30, 400};
		int largest, position = 1;
		
		System.out.println("The largest value in this array is: " + maxElement(numbers,numbers[0],position));
	}
	
	public static int maxElement(int[] array,int max, int pos)
	{
		if(pos < array.length)
		{
			 if(array[pos] > array[0])
			 {
				 max = array[pos];
				 return maxElement(array,max,pos+1);
			 }
			 else
				 return maxElement(array,max,pos+1);
		}	
		return max;
	}
}

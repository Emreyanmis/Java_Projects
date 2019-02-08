
public class NumberAnalyzer<T extends Number>
{
	T[] array;
	double total;
	
	public NumberAnalyzer(T[] array)
	{
		this.array = array;
	}
	
	public T highest()
	{
		T high = array[0];
		
		for(int i = 0; i < array.length; i++)
		{
			if(high.toString().compareTo(array[i].toString()) < 0)
				high = array[i];
		}
		
		return high;
	}
	
	public T lowest()
	{
		T low = array[0];
		
		for(int i = 0; i < array.length; i++)
		{
			if(low.toString().compareTo(array[i].toString()) > 0)
				low = array[i];
		}
		
		return low;
	}
	
	public double sum()
	{
		total = 0.0;
		
		for(int i = 0; i < array.length; i++)
		{
			total += array[i].doubleValue();
		}
		
		return total;
	}
	
	public double average()
	{
		double avg;
		
		avg = total / array.length;
		return avg;
	}
	
}

import java.math.*;

public class NumberAnalyzerDemo 
{

	public static void main(String[] args) 
	{
		
		Integer[] values = {43290, 45534, 65460, 45344, 34543};
		Double[]  numbers = {43.90,24.99, 62.00, 43.23};
		
		NumberAnalyzer<Integer> demo1 = new NumberAnalyzer<Integer>(values);
		NumberAnalyzer<Double> demo2 = new NumberAnalyzer<Double>(numbers);
		
		System.out.print("The array of integers: \n[ ");
		for(int i = 0; i < values.length; i++)
			System.out.print(values[i] + " ");
		System.out.println("]");
		
		double sum1 = demo1.sum();
		double average1 = demo1.average();
		
		System.out.println("\nThe highest value in the array: " + demo1.highest());
		System.out.println("The lowest value in the array: " + demo1.lowest());
		System.out.println("The average value in the array: " + average1);
		System.out.println("The sum in the array: " + sum1);
		
		System.out.print("\n\nThe array of doubles: \n[");
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println("]");

		
		double sum2 = demo2.sum();
		double average2 = demo2.average();
		
		System.out.println("\nThe highest value in the array: " + demo2.highest());
		System.out.println("The lowest value in the array: " + demo2.lowest());
		System.out.printf("The average value in the array: %.2f\n",average2);
		System.out.printf("The sum in the array: %.2f", sum2);
		
	}

}

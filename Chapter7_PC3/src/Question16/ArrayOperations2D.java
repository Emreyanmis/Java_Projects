package Question16;

import java.util.Scanner;
public class ArrayOperations2D 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int hr,
		    lr,
		    rt,
		    ct;
		
		 int[][] numbers = { {23, 56, 89, 43,20},
				             {34,99, 45, 23, 45},
				             {12,25, 78, 56 ,34}};
		 
		 for(int i = 0; i < numbers.length; i++)
		 {
			 for(int j = 0 ; j < numbers[i].length; j++)
				 System.out.print(numbers[i][j] + " ");
			 System.out.println();
		 }
		
		 System.out.print("\nEnter the row number for its higest value: ");
		 hr = keyboard.nextInt();
		 
		 System.out.print("Enter the row number for its lowest value: ");
		 lr = keyboard.nextInt();
		 
		 System.out.print("Enter the row number for its sum: ");
		 rt = keyboard.nextInt();
		 
		 System.out.print("Enter the column number for its sum: ");
		 ct = keyboard.nextInt();
		 
		 
		 
		System.out.println("The sum of the 2D array: " + getTotal(numbers) +
						   "\nThe average of the 2D array: " + getAverage(numbers) +
							"\nThe row " + rt + " total: " + getRowTotal(numbers, rt) + 
							"\nThe column " + ct + " total: "+ getColumnTotal(numbers, ct) +
							"\nThe highest value in the row " + hr + ": " + getRowHighest(numbers,hr)+
							"\nThe lowest value in the row " + lr + ": " + getRowLowest(numbers,lr));

	}
	
	public static int getTotal(int[][] array)
	{
		int sum = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length;j++)
				sum += array[i][j];
		}
		
		return sum;
	} 
	
	public static int getAverage(int[][] array)
	{
		int sum = 0;
		int average = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length;j++)
			{	
				sum += array[i][j];
			}
			
			average = sum / (array.length + array[i].length);
		}
		
		return average;	
	}
	
	public static int getRowTotal(int[][] array, int index)
	{
		int  rowTotal = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			 rowTotal = 0;
			
			for(int j = 0; j < array[i].length; j++)
				rowTotal += array[index -1][j];
		}
		return rowTotal;
	}
	
	public static int getColumnTotal(int[][] array, int index)
	{
		int columnTotal = 0;
		
		for(int i = 0; i < array.length; i++)	
				columnTotal += array[i][index - 1];
				
		return columnTotal;
	}
	
	public static int getRowHighest(int[][] array, int index)
	{
		int highest = array[index -1][0];
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length;j++)
			{	
				if(array[index- 1][j] > highest)
					highest = array[index- 1][j];
			}		
		}
		
		return highest;
	}
	
	public static int getRowLowest(int[][] array, int index)
	{
		int lowest = array[index - 1][0];
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				if(lowest > array[index - 1][j])
					lowest = array[index - 1][j];
			}

		}
		return lowest;		
	}
}

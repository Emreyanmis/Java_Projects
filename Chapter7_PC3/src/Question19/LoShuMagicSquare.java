package Question19;

import java.util.Scanner;
public class LoShuMagicSquare 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int [][] grid = new int[3][3];
		
		int number;
		
		for(int i = 0; i < grid.length; i++)
		{
			
			for(int j = 0; j< grid[i].length;j++)
			{
				System.out.print("Enter a number for row #"+ (i+1) + ", column #" +(j+1) +" :");
				number = keyboard.nextInt();
				grid[i][j] = number;
			}
		
		}
		
		for(int i = 0; i < grid.length; i++)
		{
			
			for(int j = 0; j< grid[i].length;j++)
			{
				System.out.print(grid[i][j] +" ");
			}
			
			System.out.println();
		}
		
		rules(grid);

	}
	
	public static void rules(int[][] array)
	{
		int total = 15;
		int sum = 0, f= 0 , l= 0;
		int a = 0, s = 0, d = 0;
		
		for(int i = 0; i < array.length; i++)
		{
				sum += array[i][0];
		   
			if(sum == total)
			{
				for(int j = 0; j < array.length; j++)
				{
					 f += array[j][1];
				}
				
				if(f == total)
				{
					for(int k = 0; k < array.length; k++)
					{
						  l += array[k][2];
					}
					
					if(l == total)
						System.out.println("The sum of rows is " + total );
				}
				
			}
				
				
		}
		
		for(int i = 0; i < array.length; i++)
		{
				a += array[0][i];
		   
			if(a == total)
			{
				for(int j = 0; j < array.length; j++)
				{
					 s += array[1][j];
				}
				
				if(s == total)
				{
					for(int k = 0; k < array.length; k++)
					{
						  d += array[2][k];
					}
					
					if(d == total)
						System.out.println("The sum of columns is " + total );
				}
				
			}
				
		}
		
		
		if(array[0][0] + array[1][1] + array[2][2] == 15)
		  {
			  if(array[0][2] + array[1][1] + array[2][0] == 15)
				  System.out.println("The sum of diagonal is " + total );
		  }	
	}

}

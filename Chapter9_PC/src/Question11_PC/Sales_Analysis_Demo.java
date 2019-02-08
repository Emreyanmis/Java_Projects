package Question11_PC;

import java.util.Scanner;
import java.io.*;

public class Sales_Analysis_Demo
{
   public static void main(String[] args) throws FileNotFoundException
   {
	   Sales_Analysis demo = new Sales_Analysis();
	   
	   // count The given weeks
	   int count = 1;
	   
	   String[] salesData1 = null, salesData2 = null, salesData3 = null;
	   
	   double[] sales1 = new double[7];
	   double[] sales2 = new double[7];
	   double[] sales3 = new double[7];
	   
	   double totalSales1, totalSales2, totalSales3, allWeeksTotal;
	   double averegeSales1, averegeSales2, averegeSales3, averageWeeklySales;
	   
	   int highestSalesWeek, lowestSalesWeek;
	   
	   File file = new File("Saless.txt");
	   Scanner input = new Scanner(file);
	   
	   while(input.hasNextLine())
	   {
		   String line = input.nextLine();
		   
		   if(count == 1)
			   salesData1 = line.split(",");
		   else if(count == 2)
			   salesData2 = line.split(",");
		   else if (count == 3)
			   salesData3 = line.split(",");
		   count++;
	   }
	   
	   System.out.println("Date for the week1: ");
	   for(int i = 0; i < salesData1.length; i++)
	   {
		   sales1[i] = Double.parseDouble(salesData1[i]);
		   
		   System.out.println(sales1[i] + "");
	   }
	   
	   System.out.println("\n\nDate for the week2: ");
	   for(int i = 0; i < salesData2.length; i++)
	   {
		   sales2[i] = Double.parseDouble(salesData2[i]);
		   
		   System.out.println(sales2[i] + "");
	   }
	   
	   System.out.println("\n\nDate for the week3: ");
	   for(int i = 0; i < salesData3.length; i++)
	   {
		   sales3[i] = Double.parseDouble(salesData3[i]);
		   
		   System.out.println(sales3[i] + "");
	   }
	   
      totalSales1 = demo.getTotalSales(sales1);
      totalSales1 = Math.round(totalSales1 * 100.00) / 100.00;
      
      totalSales2 = demo.getTotalSales(sales2);
      totalSales2 = Math.round(totalSales2 * 100.00) / 100.00;
      
      totalSales3 = demo.getTotalSales(sales3);
      totalSales3 = Math.round(totalSales3 * 100.00) / 100.00;
      
      
      averegeSales1 = demo.getAverageDaily(totalSales1);
      averegeSales1 = Math.round(averegeSales1 * 100.0) / 100.0; 
      
      averegeSales2 = demo.getAverageDaily(totalSales2);
      averegeSales2 = Math.round(averegeSales2 * 100.0) / 100.0; 
      
      averegeSales3 = demo.getAverageDaily(totalSales3);
      averegeSales3 = Math.round(averegeSales3 * 100.0) / 100.0; 
      
      
      allWeeksTotal = totalSales1 +  totalSales2 +  totalSales3;
      averageWeeklySales = averegeSales1 + averegeSales2 +averegeSales3;
      
      highestSalesWeek = demo.getHighestWeekSales(totalSales1, totalSales2, totalSales3);
      lowestSalesWeek = demo.getLowestWeekSales(totalSales1, totalSales2, totalSales3);
      
      
      System.out.println("\n\n\nTotal Sales of week1: " + totalSales1);
      System.out.println("Total Sales of week2: " + totalSales2);
      System.out.println("Total Sales of week3: " + totalSales3);
	   
      System.out.println("\nAverage Sales of week1: " + averegeSales1);
      System.out.println("Average Sales of week2: " + averegeSales2);
      System.out.println("Average Sales of week3: " + averegeSales3);
      
      System.out.println("\nThe total sales for all the weeks: " +  allWeeksTotal);
      System.out.println("The average sales for all the weeks: " +  averageWeeklySales);
      
      System.out.println("\nThe week with the highest salary: " +  highestSalesWeek);
      System.out.println("\nThe week with the lowest salary: " +  lowestSalesWeek);
      
   }
	
}

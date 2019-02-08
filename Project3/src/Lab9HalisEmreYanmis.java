
/**
	Programmed by Halis Emre Yanmis
	Lab9
*/

import java.text.DecimalFormat;

public class Lab9HalisEmreYanmis
{
    public static void main(String[] args)
    {
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		DecimalFormat intDisguise = new DecimalFormat("###");

        int index;

        double[] salesData = {1245.67, 1490.07, 1679.87, 2371.46, 1783.92, 1461.99, 2059.77};
        double[] salesData2 = {2541.36, 2965.88, 1965.32, 1845.23, 7021.11, 9652.74, 1469.36};
        double[] salesData3 = {2513.45, 1963.22, 1568.35, 1966.35, 1893.25, 1025.36, 1128.36};

        double totalWeek1 = 0;
        double totalWeek2 = 0;
        double totalWeek3 = 0;

        double highestWeek1 = 0;
        double highestWeek2 = 0;
        double highestWeek3 = 0;

        double highestWeek = 0;

        double lowestWeek = 0;


        displayArray(salesData);
        displayArray(salesData2);
        displayArray(salesData3);

		for(double n : salesData)
			totalWeek1 += n;

		for(double n : salesData2)
			totalWeek2 += n;

		for(double n : salesData3)
			totalWeek3 += n;

        System.out.println("\n\n\tThe total sales for week 1 is:\t\t\t\t\t$" + dollar.format(totalWeek1));
        System.out.println("\tThe total sales for week 2 is:\t\t\t\t\t$" + dollar.format(totalWeek2));
        System.out.println("\tThe total sales for week 3 is:\t\t\t\t\t$" + dollar.format(totalWeek3));

        System.out.println("\n\tThe total sales for all weeks is:\t\t\t\t" + "$" + dollar.format((totalWeek1 + totalWeek2 + totalWeek3)));



		if(totalWeek1 > totalWeek2 && totalWeek1 > totalWeek3)
			highestWeek = 1;
		else if(totalWeek2 > totalWeek1 && totalWeek2 > totalWeek3)
			highestWeek = 2;
		else
			highestWeek = 3;

		if(totalWeek1 < totalWeek2 && totalWeek1 < totalWeek3)
			lowestWeek = 1;
		else if(totalWeek2 < totalWeek2 && totalWeek2 < totalWeek3)
			lowestWeek = 2;
		else
			lowestWeek = 3;

		System.out.println("\n\n\tThe week number that had the highest amount of sales is:\t\t" + intDisguise.format(highestWeek));
		System.out.println("\tThe week number that had the lowest amount of sales is:\t\t" + intDisguise.format(lowestWeek));

	}

	public static void displayArray(double[] array)
	{
		int index;

	 	System.out.print("Day:");
		for (index = 1; index < 8; index++)
			System.out.print("\t" + index);
		for (index = 1; index < 8; index++)
			System.out.printf("%2s "," ");
        System.out.println();

	 	for (index = 0; index < 7; index++)
			System.out.print("\t" + array[index]);

		System.out.println("\n");
	}
}
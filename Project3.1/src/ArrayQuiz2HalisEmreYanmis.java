/**
    Programmed by:  Halis Emre Yanmis
    Instructor:     Linda Yang
    Date:           04/18/2018
*/

import java.util.Random;

public class ArrayQuiz2HalisEmreYanmis
{
    public static void main(String[] args)
    {
        Random randomNumbers = new Random();
        int index;
        // declare and allocate sillyLittleArray
        int[] sillyLittleArray = new int[25];
        int total = 0;
        int highest = 0;
        int lowest = 0;
        int highestValueLocation = 0;
        int lowestValueLocation = 0;
        double averageValue;

        // populate sillyLittleArray
        for (index = 0; index < sillyLittleArray.length; index++)
            sillyLittleArray[index] = randomNumbers.nextInt(100); // random 0-99

        // display sillyLittleArray
        displayArray(sillyLittleArray);



        // calculates the total value
		for(int s : sillyLittleArray)
		{
			total += s;
		}

		averageValue = (double) total / sillyLittleArray.length;



        // displays the total value as well as the average value
        System.out.println("\nTotal:\t\t" + total);
		System.out.println("Average:\t" + averageValue);



        // calculates the highest value
        for(int i = 0; i < sillyLittleArray.length; i++)
		{
			if(sillyLittleArray[i] > highest)
			{
				highest = sillyLittleArray[i];
			}
		}

        // calculates the highest value's location
		for (int i = 1; i < sillyLittleArray.length; i++)
		{
			int newnumber = sillyLittleArray[i];

			if ((newnumber > sillyLittleArray[highestValueLocation]))
			{
				highestValueLocation = i;
			}
		}

        // displays the highest value's location
		System.out.println("\nHigh value:\t" + highest + " at location " + highestValueLocation);



        // calculates the lowest value
		for(int i = 0; i < sillyLittleArray.length; i++)
		{    
			
			
			if(sillyLittleArray[i] < lowest)
			{  	
				lowest = sillyLittleArray[i];
			}
		}

        // calculates the lowest value's location
		for (int i = 1; i < sillyLittleArray.length; i++)
		{
			int newnumber = sillyLittleArray[i];

			if ((newnumber < sillyLittleArray[lowestValueLocation]))
			{
				lowestValueLocation = i;
			}
		}

        // displays the lowest value's location
		System.out.println("\nLow value:\t" + lowest + " at location " + lowestValueLocation);
    }


    public static void displayArray(int[] array)
    {
        int index;

        // display sillyLittleArray header
        System.out.print("Loc:");
        for (index = 0; index < array.length; index++)
            System.out.printf("%2d ",index);
        System.out.println();
        System.out.print("    ");
        for (index = 0; index < array.length; index++)
            System.out.printf("%2s ","--");
        System.out.println();
        // display sillyLittleArray data
        System.out.print("Dat:");
        for (index = 0; index < array.length; index++)
            System.out.printf("%2d ",array[index]);
        System.out.println();
    }

}

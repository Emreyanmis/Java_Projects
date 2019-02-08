/**
    Programmed by:  Stephen Brower
    Updated by:     Linda Yang
    Purpose:        for Quiz 2
*/

import java.util.Random;

public class RandomArrayForQuiz2
{
    public static void main(String[] args)
    {
        Random randomNumbers = new Random();
        int index;
        // delare and allocate sillyLittleArray
        int[] sillyLittleArray = new int[25];
        int total = 0;
        int highestValueLocation;
        int lowestValueLocation;
        double averageValue;

        // populate sillyLittleArray
        for (index = 0; index < sillyLittleArray.length; index++)
            sillyLittleArray[index] = randomNumbers.nextInt(100); // random 0-99

        // display sillyLittleArray
        displayArray(sillyLittleArray);

        // the miracle occurs here...



        // calculate average

        // display results


        // display high


        // display low


    }

    /**
        no need to change this method
    */
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
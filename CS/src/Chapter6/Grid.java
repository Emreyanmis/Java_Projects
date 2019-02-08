package Chapter6;

/**
Uodated by Linda Yang
Programmed by   Stephen Brower
Date written    7/9/2014
*/

import java.util.Random;

public class Grid
{
// class fields
private int[][] gameBoard;
private int currentRow;
private int currentCol;

//for random numbers
Random randomNumbers = new Random();

// constants
private final int MAX_ELEMENT_VALUE = 1000;

/**
    no-arg constructor - creates a 10x10 grid and sets random location
*/
public Grid()
{
	// use the contructor to create a new array, populate
	// values and do your first jump!!! Remember, don't
	// jump off the edge!

}

/**
    constructor  - creates a grid (newGridSize x newGridSize) and sets random location
    @param newGridSize is value to set for dimensions of grid
*/
public Grid(int newGridSize)
{
    // use this construct to do the same thing as the last
    // one only passing in a newGridSize
}

/** private method populateBoard to set locations to random value
*/
private void populateBoard()
{
    int row, col;

    // use random to populate the elememts of a
    // two dimensional array
}

/**
    jump method sets random location
*/
public void jump()
{

}

/**
    getCurrentRow method returns value in currentRow field
    @return value in currentRow field
*/
public int getCurrentRow()
{

}

/**
    getCurrentCol method returns value in currentCol field
    @return value in currentCol field
*/
public int getCurrentCol()
{

}

/**
    getCurrentValue method returns value in gameBoard
    at the currentRow/currentCol field
    @return value in gameBoard[currentRow][currentCol]
*/
public int getCurrentValue()
{

}

/**
    goNorth method decreases value in currentRow
*/
public void goNorth()
{
    // decrease row (north)


    // make sure not less than 0

}

/**
    goSouth method increases value in currentRow
*/
public void goSouth()
{
    // increase row (south)


    // make sure not greater than length-1

}

/**
    goWest method decreases value in currentCol
*/
public void goWest()
{
    // decrease col (west)


    // make sure not less than 0

}

/**
    gatherDaisies method decreases current location in grid by
    80% and returns the value decremented
    @return value of 80% decrease in cell
*/
public int gatherDaisies()
{
    int daisiesGathered;


    return daisiesGathered;
}

/**
    goEast method increases value in currentCol
*/
public void goEast()
{
    // increase col (east)

    // make sure not greater than length-1

}

/**
    getGridSize method returns size of grid
    @return value of gameBoard.length
*/
public int getGridSize()
{
    return gameBoard.length;
}

/**
    toString method used to return a String representing this Grid
    @return a String representing this Frid
*/
public String toString()
{
    String stringToReturn = "";
    int row, col;

    for (row = 0; row < gameBoard.length; row++)
    {
        for (col = 0; col < gameBoard.length; col++)
        {
            if (gameBoard[row][col] < 100)
                stringToReturn = stringToReturn + " ";
            if (gameBoard[row][col] < 10)
                stringToReturn = stringToReturn + " ";
            stringToReturn = stringToReturn + gameBoard[row][col] + " ";
        }
        stringToReturn = stringToReturn + "\n";
    }


    return stringToReturn;
}
}
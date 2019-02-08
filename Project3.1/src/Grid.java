/**
Updated by Linda Yang
Programmed by   Stephen Brower
Date written    7/9/2014
*/

import java.util.Random;

public class Grid
{
	// These are the  class fields
	private int[][] gameBoard;
	private int currentRow;
	private int currentCol;
    private int daisiesGathered;
    private int numOfGathers;
    
        
    private boolean north = false;
    private boolean south = false;
    private boolean east = false;
    private boolean west = false;


	//for random numbers
	Random randomNumbers = new Random();

	//The followings are the  constants
	private final int MAX_ELEMENT_VALUE = 1000;

	/**
    	no-arg constructor - creates a 10x10 grid and sets random location
	*/
	public Grid()
	{
		gameBoard = new int[10][10];
		currentRow = randomNumbers.nextInt(10);
		currentCol = randomNumbers.nextInt(10);
		populateBoard();
		
		if(currentRow >10 && currentCol>10)
			System.out.println("Out of bounds.");
	}

	/**
  		constructor  - creates a grid (newGridSize x newGridSize) and sets random location
    	@param newGridSize is value to set for dimensions of grid
	*/

	public Grid(int newGridSize)
	{
    	// utilizes this construct to do the same thing as the last
    	// one only passing in a newGridSize

		gameBoard = new int[newGridSize][newGridSize];
		currentRow = randomNumbers.nextInt(9);
		currentCol = randomNumbers.nextInt(9);
		populateBoard();

		if(currentRow > newGridSize && currentCol> newGridSize)
			System.out.println("Out of bounds.");
	}

	/**
		The private method populateBoard to set locations to random value
	*/

	private void populateBoard()
	{
    	int row, col;

		for(col = 0; col < gameBoard.length;col++)
		{
			for(row = 0;row<gameBoard[col].length;row++)
			{
				gameBoard[col][row]= randomNumbers.nextInt(1000);
			}
		}
	}

	/**
   		The jump method sets random location
	*/

	public void jump()
	{
		currentRow = randomNumbers.nextInt(9);
		currentCol = randomNumbers.nextInt(9);
	}

	/**
    	getCurrentRow method returns value in currentRow field
    	@return value in currentRow field
	*/

	public int getCurrentRow()
	{
		return currentRow;
	}

	/**
	    getCurrentCol method returns value in currentCol field
	    @return value in currentCol field
	*/

	public int getCurrentCol()
	{
		return currentCol;
	}

	/**
	    getCurrentValue method returns value in gameBoard
	    at the currentRow/currentCol field
	    @return value in gameBoard[currentRow][currentCol]
	*/

	public int getCurrentValue()
	{
		int currentValue = 0;
		currentValue = gameBoard[currentRow][currentCol];
		return currentValue;
	}

	/**
	    goNorth method decreases value in currentRow
	*/

	public void goNorth()
	{
           
		if(currentRow == 0 || currentRow == gameBoard.length-1) {
                    if(south == true) {
                        currentRow--;
                        south = false;
                    }
                    else {
			System.out.println("cannot go any lower.");
                        north = true;
                    }
                }
	   
                else
                    currentRow--;

	}

	/**
  	  goSouth method increases value in currentRow
	*/

	public void goSouth()
	{
               
		if(currentRow == 0 || currentRow == gameBoard.length-1) {
                    if(north == true) {
                        currentRow++;
                        north = false;
                    }
                    else {
			System.out.println("cannot go any higher.");
                        south = true;
                    }
                }
   		
                else
                    currentRow++;

	}

	/**
    	goWest method decreases value in currentCol
	*/

	public void goWest()
	{
         
		if(currentCol == 0 || currentCol == gameBoard.length-1) {
                    if(east == true) {
                        currentCol--;
                        east = false;
                    }
                    else {
			System.out.println("cannot go any lower.");
                        west = true;
                    }
                }
            
                else
                    currentCol--;
	}

	/**
    	gatherDaisies method decreases current location in grid by
    	80% and returns the value decremented
    	@return value of 80% decrease in cell
	*/

	public void gatherDaisies()
	{
    	daisiesGathered += getCurrentValue();
	}
        
        public int showDaisies() 
        {
            return daisiesGathered;
        }
        
     
      
    
	/**
   		goEast method increases value in currentCol
	*/

	public void goEast()
	{
           
		if(currentCol == 0 || currentCol == gameBoard.length-1) {
                    if(west == true) {
                        currentCol++;
                        west = false;
                    }
                    else {
			System.out.println("cannot go any lower.");
                        east = true;
                    }
                }
           
                else
                    currentCol++;

		
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
    	@return a String representing this grid
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

// Programmed by Halis Emre Yanmis

public class ParkingEs
{
	private char parkingType;
	private int levels;
	private int numSpaces;
	private double cost = 0;

	public Parking(char newParkingType, int newLevels, int newNumSpaces)
	{
		parkingType = newParkingType;
 		levels = newLevels;
 		numSpaces = newNumSpaces;
	}

	public int getLevels()
	{
		return levels;
	}

	public int getNumSpaces()
	{
		return numSpaces;
	}

	public char getParkingType()
	{
		return parkingType;
	}


	public void setLevels(int newLevels)
	{
		levels = newLevels;
	}

	public void setNumSpaces(int newNumSpaces)
	{
		numSpaces = newNumSpaces;
	}

	public void setParkingType(char newParkingType)
	{
			parkingType = newParkingType;
	}

	public double cost()
	{
		if (parkingType == 'L')
		{
			cost = (numSpaces * 1685.43);
		}

		if (parkingType == 'D')
		{
			cost = ((numSpaces * 26236.71) + ((levels - 1) * 1000000.00));
		}

		return cost;
	}
}
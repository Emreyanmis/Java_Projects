package Question8;

public class ParkingMeter 
{
    private int parkingTime;

	public ParkingMeter(int parkingTime) 
	{		
		this.parkingTime = parkingTime;
	}

	/**
	 * @return the parkingTime
	 */
	public int getParkingTime()
	{
		return parkingTime;
	}

	/**
	 * @param parkingTime the parkingTime to set
	 */
	public void setParkingTime(int parkingTime) 
	{
		this.parkingTime = parkingTime;
	}
	
	public String toString()
	{
		return "Number of times parking time that has been "
				+ "purchased: " + parkingTime;
	}
	
    
}

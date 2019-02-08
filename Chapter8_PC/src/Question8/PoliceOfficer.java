package Question8;

public class PoliceOfficer 
{
   private String name;
   private int badge;
   
   public PoliceOfficer(String name, int badge) 
   {
	this.name = name;
	this.badge = badge;
   }
	
	public PoliceOfficer(PoliceOfficer object2) 
	{
		this.name = object2.name;
		this.badge = object2.badge;
	}

	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}
	
	/**
	 * @return the badge
	 */
	public int getBadge()
	{
		return badge;
	}
	
	/**
	 * @param badge the badge to set
	 */
	public void setBadge(int badge) 
	{
		this.badge = badge;
	}
	
	public ParkingTicket search(ParkedCar object1, ParkingMeter object2)
	{
		ParkingTicket parkingTicket = null;
		
		int illegalMinutes = object1.getNumTimesParked() - object2.getParkingTime();
		
		if(illegalMinutes > 0)
			parkingTicket = new ParkingTicket(object1,this, illegalMinutes);
	     
		return parkingTicket;
	}
	
	public String toString()
	{
		return "\nPolice Officer Data" + "\nPolice Officer Name: " + name
				+ "\nPolice Officer's badge number: " + badge;
	}
	
	
   
   
   
   
   
}

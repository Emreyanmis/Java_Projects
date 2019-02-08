package Question8;

public class ParkingTicket
{
  private ParkedCar parkedCar;
  private PoliceOfficer policeOfficer;
  
  private double fine;
  private int minutes;
  private double first_hour_fine = 25.0;
  private double additional_hour_fine = 25.0;
  
  public ParkingTicket(ParkedCar car, PoliceOfficer officer, int min)
  { 
	  parkedCar =  new ParkedCar(car);
	  policeOfficer = new PoliceOfficer(officer);
	  minutes = min;
	  
	  computeFine();
  }
  
  private void computeFine()
  {
	  double timeInHours = minutes / 60.0;
	  int inHours = (int)(timeInHours);
	  
	  fine = first_hour_fine;
	  fine += (inHours * additional_hour_fine);
  }

	/**
	 * @return the parkedCar
	 */
	public ParkedCar getParkedCar() 
	{
		return new ParkedCar(parkedCar);
	}
	
	/**
	 * @param parkedCar the parkedCar to set
	 */
	public void setParkedCar(ParkedCar parkedCar) 
	{
		this.parkedCar = parkedCar;
	}
	
	/**
	 * @return the policeOfficer
	 */
	public PoliceOfficer getPoliceOfficer() 
	{
		return  new PoliceOfficer(policeOfficer);
	}
	
	/**
	 * @param policeOfficer the policeOfficer to set
	 */
	public void setPoliceOfficer(PoliceOfficer policeOfficer) 
	{
		this.policeOfficer = policeOfficer;
	}
	
	/**
	 * @return the fine
	 */
	public double getFine()
	{
		return fine;
	}
	
	/**
	 * @param fine the fine to set
	 */
	public void setFine(double fine) 
	{
		this.fine = fine;
	}
	
	/**
	 * @return the minutes
	 */
	public int getMinutes() 
	{
		return minutes;
	}
	
	/**
	 * @param minutes the minutes to set
	 */
	public void setMinutes(int minutes) 
	{
		this.minutes = minutes;
	}
	
	public String toString()
	{
		return  parkedCar + "\n" + policeOfficer + "\nMinutes Illegaly parked: "+ minutes+
				"\n" + "Fine: $" + String.format("%.2f", fine);
	}
	  
}

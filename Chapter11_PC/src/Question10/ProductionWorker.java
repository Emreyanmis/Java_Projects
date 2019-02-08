package Question10;

public class ProductionWorker extends Employee
{
   private int shift;
   private double hourlyPayRate;
   private String shift1 = "Day Shift";
   private String shift2 = "Night Shift";
   
   
   public ProductionWorker(String name, String numberLetter, 
		   					String hireDate, int shift,
		   					double hourlyPayRate) throws InvalidEmployeeNumber, InvalidShift, InvalidPayRate
   {
	super(name, numberLetter, hireDate);
	
	if(shift == 1 || shift == 2)
		this.shift = shift;
	else
		throw new InvalidShift();
	
	if(hourlyPayRate < 0)
		throw new InvalidPayRate();
	else
		this.hourlyPayRate = hourlyPayRate;
   }

	/**
	 * @return the shift
	 */
	public int getShift() 
	{
		return shift;
	}
	
	/**
	 * @param shift the shift to set
	 */
	public void setShift(int shift) 
	{
		if(this.shift == 1)
			this.shift = Integer.parseInt(shift1);
		else if(this.shift == 2)
			this.shift = Integer.parseInt(shift2);
	}
	
	/**
	 * @return the hourlyPayRate
	 */
	public double getHourlyPayRate()
	{
		return hourlyPayRate;
	}
	
	/**
	 * @param hourlyPayRate the hourlyPayRate to set
	 */
	public void setHourlyPayRate(double hourlyPayRate) 
	{
		this.hourlyPayRate = hourlyPayRate;
	}
    
	public String toString()
	{
		String str;
		
		shifts(shift);
		
		
		str = super.toString() + "\nShift: " + shifts(shift) + "\nHourtly Pay Rate: " + hourlyPayRate;
		
		return str;
	}
	
	public String shifts(int shift)
	{
		String str1 = null;
		
		if(shift == 1)
			return str1 = "Day Shift";
		else if(shift == 2)
			return str1 = "Night Shift";
        
		return str1;

	}
   
}

package Question5;

public class PayrollClass 
{
   private String name;
   private int idNumber;
   private int hourlyPayRate;
   private int numOfHoursWorked;
   
   public PayrollClass(String name, int idNumber, int hourlyPayRate, int numOfHoursWorked) 
     throws InvalidEmployeeName, InvalidEmployeeNumber, InvalidWorkedHours, InvalidHourlyPayRate
   {	
	   if(name == null)
		   throw new InvalidEmployeeName();
	   else
		   this.name = name;
	     
	   if(idNumber <= 0)
		   throw new InvalidEmployeeNumber();
	   else
		   this.idNumber = idNumber;
	   
	   if(hourlyPayRate < 0 || hourlyPayRate > 25)
		   throw new InvalidHourlyPayRate();
	   else
		   this.hourlyPayRate = hourlyPayRate;
	   
	   if (numOfHoursWorked > 84 || numOfHoursWorked < 0)
		   throw new InvalidWorkedHours();
	   else
		   this.numOfHoursWorked = numOfHoursWorked;
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
	 * @return the idNumber
	 */
	public int getIdNumber() 
	{
		return idNumber;
	}
	
	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(int idNumber) 
	{
		this.idNumber = idNumber;
	}
	
	/**
	 * @return the hourlyPayRate
	 */
	public int getHourlyPayRate()
	{
		return hourlyPayRate;
	}
	
	/**
	 * @param hourlyPayRate the hourlyPayRate to set
	 */
	public void setHourlyPayRate(int hourlyPayRate)
	{
		this.hourlyPayRate = hourlyPayRate;
	}
	
	/**
	 * @return the numOfHoursWorked
	 */
	public int getNumOfHoursWorked() 
	{
		return numOfHoursWorked;
	}
	
	/**
	 * @param numOfHoursWorked the numOfHoursWorked to set
	 */
	public void setNumOfHoursWorked(int numOfHoursWorked) 
	{
		this.numOfHoursWorked = numOfHoursWorked;
	}
	
	/**
	 * grossPay method
	 * @return hourlyPayRate * numOfHoursWorked
	 */
	public double getSalary() 
	{
		return hourlyPayRate * numOfHoursWorked;
	
	}
	
}

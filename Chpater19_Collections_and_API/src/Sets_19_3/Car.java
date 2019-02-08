package Sets_19_3;

public class Car 
{
	private String vin;
	private String description;
   
	public Car(String v, String desc)
	{
		vin = v;
		description = desc;
	}

	/**
	 * @return the vin
	 */
	public String getVin() 
	{
		return vin;
	}

	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}
	
	public String toString()
	{
		return "VIN: " + vin + "\tDescription: " + description;
	}
	
	/**
	 * hashCode method
	 * 
	 * @return A hashCode for this car
	 */
	public int hashCode()
	{
		return vin.hashCode();
	}
	
	/**
	 * equals method
	 * 
	 * @param obj Another object to compare this object to.
	 * @return true if the two objects are equal, false otherwise.
	 */
	
	public boolean equals(Object obj)
	{
		// Make sure the other object is a Car
		if(obj == null || !(obj instanceof Car))
			return false;
		else
		{
			// Both are cars: Get a reference to other
			// object as a car and check if their VIN numbers are the same.
			Car tempCar = (Car) obj;
			return vin.equalsIgnoreCase(tempCar.vin);
		}
	}
}

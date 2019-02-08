package Sets_19_3;

public class Computer 
{
	
	private String IP_number;
	private String brand;
	
	public Computer(String iP_number, String brand)
	{

		IP_number = iP_number;
		this.brand = brand;
	}

	/**
	 * @return the iP_number
	 */
	public String getIP_number() 
	{
		return IP_number;
	}

	/**
	 * @return the brand
	 */
	public String getBrand()
	{
		return brand;
	}
	
	public String toString()
	{
		return "IP Number: " + IP_number + "\tBrand: " + brand;
	}
	
	public int hashCode()
	{
		return IP_number.hashCode();
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
		if(obj == null || !(obj instanceof Computer))
			return false;
		else
		{
			// Both are computers: Get a reference to other
			// object as a computer and check if their IP numbers are the same.
			Computer tempComp = (Computer) obj;
			return IP_number.equalsIgnoreCase(tempComp.IP_number);
		}
	}
	
	
	
	
	
	

}

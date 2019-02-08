package Question2;

public class Employee 
{
   private String ID_number;
   private String name;
   
   public Employee(String iD_number, String name) 
   {
	ID_number = iD_number;
	this.name = name;
   }

	/**
	 * @return the iD_number
	 */
	public String getID_number() 
	{
		return ID_number;
	}
	
	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}
	
	public String toString()
	{
		return "ID number: " + ID_number + "\tName: " + name;
	}
	
	public int hashCode()
	{
		return ID_number.hashCode();
	}
	
	public boolean equals(Object obj)
	{
		if(obj == null || !(obj instanceof Employee))
			return false;
		else
		{
			Employee tempEmployee = (Employee) obj;
			return ID_number.equalsIgnoreCase(tempEmployee.ID_number);
		}
	}
	   
}

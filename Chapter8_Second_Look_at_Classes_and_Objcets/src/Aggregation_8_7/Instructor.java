package Aggregation_8_7;

public class Instructor 
{
   private String lastName;
   private String firstName;
   private String officeNumber;
   
   public Instructor(String lastName, String firstName, String officeNumber) 
   {
	this.lastName = lastName;
	this.firstName = firstName;
	this.officeNumber = officeNumber;
   }
   
   public Instructor(Instructor object2)
   {
	   lastName = object2.lastName;
	   firstName = object2.firstName;
	   officeNumber = object2.officeNumber;
   }
   
   public void set(String name, String firstName, String  officeNumber)
   {
	   this.firstName = firstName;
	   this.lastName = lastName;
	   this.officeNumber = officeNumber;
   }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "LastName: " + lastName + 
				"\nFirstName: " + firstName + 
				"\nOfficeNumber: " + officeNumber;
	}
   
   
   
  
}

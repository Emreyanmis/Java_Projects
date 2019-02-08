/**
 * The Student class is an abstract class that holds general data about a student.
 * Classes representing specific types of students should inherit from this class.
 * @author emreyanmis
 */

public abstract class Student 
{
	private String name;
	private String idNumber;
	private int yearAdmitted;
	
	public Student(String name, String idNumber, int yearAdmitted) 
	{
		this.name = name;
		this.idNumber = idNumber;
		this.yearAdmitted = yearAdmitted;
	}
	
	/**
	 * The toString method returns a String containing the student's data.
	 */
	
    public String toString()
    {
    		String str;
    		
    		str = "Name: " + name +"\nID Number: " + idNumber + "\nYear Admitted: " + yearAdmitted;
    	
    		return str;
    }
    
    /**
     * The getRemainingHours method is abstract.
     * It must be overridden (meaning having written the same method name and same signature) 
     * in a subclass.
     * @return The hours remaining for the student.
     */
    
    public abstract int getRemainingHours();
}

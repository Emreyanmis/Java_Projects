package Aggregation_8_7;

public class Course 
{
   private String courseName;
   private Instructor instructor;
   private TextBook textBook;
   
   public Course(String courseName, Instructor instructor, TextBook textBook) 
   {
	this.courseName = courseName;
	
	// Create a new Instructor object, passing instructor parameter as an 
	// argument to the copy constructor.
	this.instructor = new Instructor(instructor);
	
	// Create a new TextBook object, passing textBook parameter as an
	// argument to the copy constructor.
	this.textBook = textBook;
   }

	/**
	 * @return the courseName
	 */
	public String getCourseName() 
	{
		return courseName;
	}
	
	/**
	 * @return the instructor
	 */
	public Instructor getInstructor() 
	{
		return new Instructor(this.instructor);
	}
	
	/**
	 * @return the textBook
	 */
	public TextBook getTextBook() 
	{
		return new TextBook(this.textBook);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CourseName: " + courseName + 
				"\nInstructor Information: " + instructor +
				"\nTextBook Information:" + textBook;
	}
	
	
   
   
   
   
}

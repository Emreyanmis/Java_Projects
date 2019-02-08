package Aggregation_8_7;

public class CourseDemo 
{

	public static void main(String[] args) 
	{
	   Instructor myInstructor = new Instructor("Kramer","Shawn","RH3010");
	   
	   TextBook myTextBook = new TextBook("Starting out with Java","Gaddis","Pearson");
	   
	   Course myCourse = new Course("Intro to Java", myInstructor, myTextBook);
	   
	   System.out.println(myCourse);
	}

}

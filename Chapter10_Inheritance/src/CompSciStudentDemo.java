
public class CompSciStudentDemo 
{

	public static void main(String[] args) 
	{
		CompSciStudent csStudent = new CompSciStudent("Halis Yanmis","2347SG9084", 2018);
		
		csStudent.setCsHours(11);
		csStudent.setGenEdHours(40);
		csStudent.setMathHours(20);
		
		System.out.println(csStudent);
         
		System.out.println("Hours remaining: " + csStudent.getRemainingHours());
  		
	}

}

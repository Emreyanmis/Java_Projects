
public class CompSciStudent extends Student
{
	
	// Required hours
   private final int math_Hours = 20;
   private final int cs_Hours = 40;
   private final int gen_Ed_Hours = 60;
   
   // Hours taken
   private int mathHours;
   private int csHours;
   private int genEdHours;
   
   public CompSciStudent(String name, String idNumber, int yearAdmitted) 
   {
		super(name, idNumber, yearAdmitted);
	
   }

	/**
	 * @param mathHours the mathHours to set
	 */
	public void setMathHours(int mathHours)
	{
		this.mathHours = mathHours;
	}
	
	/**
	 * @param csHours the csHours to set
	 */
	public void setCsHours(int csHours) 
	{
		this.csHours = csHours;
	}
	
	/**
	 * @param genEdHours the genEdHours to set
	 */
	public void setGenEdHours(int genEdHours) 
	{
		this.genEdHours = genEdHours;
	}
	
	@Override
	public int getRemainingHours()
	{
		int reqHours, remainingHours;
		
		reqHours = math_Hours + cs_Hours + gen_Ed_Hours;
		remainingHours = reqHours - (mathHours + csHours + genEdHours);
		
		return remainingHours;
	}
	 
	
	public String toString()
	{	
		return super.toString() + "\nMajor: Computer Science " + "\nMath Hours Taken: " + mathHours +
								"\nComputer Science: " + csHours + "\nGeneral Ed Hours Taken: " + genEdHours;
	
	}
	
   
   	
   
   
   
	
}

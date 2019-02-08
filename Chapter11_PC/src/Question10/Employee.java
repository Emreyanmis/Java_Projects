package Question10;

public class Employee 
{
	private String name;
	private String numberLetter;
	private String hireDate;
	
	public Employee(String name, String numberLetter, String hireDate)  throws InvalidEmployeeNumber
	{	
		char ch[] = new char[numberLetter.length()];
		char b = '-';
		
		for(int i = 0; i < 3; i++)
		{	   
			  ch[i] = numberLetter.charAt(i); 
			  if(!Character.isDigit(ch[i]))
				  throw new InvalidEmployeeNumber();
			  else
				  System.out.println((i+1 + " OK")); 
		  }
		
		  if(ch[3] != b)
				  throw new InvalidEmployeeNumber();
		  else
			  System.out.println(("3 is " + " OK"));
	      
		  if(!(ch[4] > 'A' || ch[4] < 'M'))
	    	  	throw new InvalidEmployeeNumber();
		  else
			  System.out.println(("4 is " + " OK"));
	 
				
		this.numberLetter = numberLetter;
		this.hireDate = hireDate;
		this.name = name;
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
	 * @return the numberLetter
	 */
	public String getNumberLetter() 
	{
		return numberLetter;
	}

	/**
	 * @param numberLetter the numberLetter to set
	 */
	public void setNumberLetter(String numberLetter) 
	{
		if(this.numberLetter.length() == 5 && Character.isDigit(this.numberLetter.charAt(0)) &&
		Character.isDigit(this.numberLetter.charAt(1)) && 
		Character.isDigit(this.numberLetter.charAt(2)) &&
		this.numberLetter.charAt(3) == '-' &&
		this.numberLetter.charAt(4) >= 'A' &&  this.numberLetter.charAt(4) >= 'M')
		{	
			this.numberLetter = numberLetter;
		}	
		else
		{	
			this.numberLetter = "Invalid employee number or Invalid employee number format";
		}			
			
	}

	/**
	 * @return the hireDate
	 */
	public String getHireDate() 
	{
		return hireDate;
	}

	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(String hireDate) 
	{
		this.hireDate = hireDate;
	}
	
	public String toString()
	{
		String str;
		
		str = "Employee name: " + name + "\nEmployee number: " + numberLetter +
				"\nHire Date: "+ hireDate;
		
		return str;
	}
}

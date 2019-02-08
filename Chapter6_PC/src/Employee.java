public class Employee 
{
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee(String n, int idn, String d, String p)
	{
		name = n;
		idNumber = idn;
		department = d;
		position = p;
	}
	
	public Employee(String n,int idn)
	{
		name = n;
		idNumber = idn;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String nam) 
	{
		name = nam;
	}

	public int getIdNumber() 
	{
		return idNumber;
	}

	public void setIdNumber(int idN) 
	{
		idNumber = idN;
	}

	public String getDepartment() 
	{
		return department;
	}

	public void setDepartment(String depart) 
	{
		department = depart;
	}

	public String getPosition() 
	{
		return position;
	}

	public void setPosition(String pos) 
	{
		position = pos;
	}

	public Employee()
	{
		name = "";
		idNumber = 0;
		department = "";
		position = "";	
	}
	
}

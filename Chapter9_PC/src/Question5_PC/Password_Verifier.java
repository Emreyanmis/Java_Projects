package Question5_PC;

public class Password_Verifier 
{
    private String password;

	public Password_Verifier(String password) 
	{
		this.password = password;
	}
	
	public boolean getLength()
	{
		boolean status;
		
		if(password.length() >= 6)
			status = true;
		else
			status = false;
		
		return status;
	}
	
	public boolean getLetters()
	{
		boolean status = false;
		
		for(int i = 0 ; i < password.length(); i++)
		{
			if(Character.isUpperCase(password.charAt(i)) || Character.isLowerCase(password.charAt(i)))
			{	
				status = true;
				break;
			}	
			else 
				status = false;
		}
		
		return status;	
	}
	
	public boolean getDigit()
	{
		boolean status = false;
		
		for(int i = 0 ; i < password.length(); i++)
		{
			if(Character.isDigit(password.charAt(i)))
			{	
				status = true;
				break;
			}	
			else
				status = false;
		}
		
		return status;
	}
}

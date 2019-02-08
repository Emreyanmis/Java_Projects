package AW;

import java.util.*;
public class AW5 extends Exception
{
	public AW5()
	{
		super("Error: The negative number ");
	}
	public AW5(int number)
	{
		super("Error: The negative number " + number);
	}

}

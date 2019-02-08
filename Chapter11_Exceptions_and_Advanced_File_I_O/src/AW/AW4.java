package AW;

import java.io.*;
public class AW4 
{

	public static void main(String[] args) 
	{
	   String str = "EMRE";
	   int number;
	   
	   try
	   {
		   number = Integer.parseInt(str);
	   }
	   catch(IllegalArgumentException e)
	   {
		   System.out.println("Bad number format: " + str);
	   }
	   

	}

}

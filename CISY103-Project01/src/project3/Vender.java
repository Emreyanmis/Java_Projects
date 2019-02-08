package project3;

public class Vender
{
	private double cost, total, change;
	private char input;
	
	public Vender(double cost1, double total1, double change1, char  input1 )
	{
		cost = cost1;
		total = total1;
		change = change1;
		input = input1;				
	}
	
	public double getTotal()
	{
		input = Character.toLowerCase(input);
		
		if(input == 'b')
			total = total + 1;
		else if(input == 'q')
			total += 0.25;
		else if(input == 'd')
			total += 0.10;
		else if(input == 'n')
			total += 0.05;
		else if(input == 'p')
			if(total < 1.25)
				total = total;
		return total;
	}
	
	public double getChange()
	{
		input = Character.toLowerCase(input);
		
		if(input == 'r')
			change = total;
		else if(input =='p')
			change = total - 1.25;
		return change;
	}
	

}

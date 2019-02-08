
public class TossingCoinsForDollarDemo 
{
	public static void main(String[] args) 
	{
		double balance = 0.0;
		double quarter = 0.25;
		double dime = 0.10;
		double nickel = 0.05;
		int i = 0;
		int j = 0;
		int k = 0;
		
		TossingCoinsForDollar quarterDemo  = new TossingCoinsForDollar();
		TossingCoinsForDollar dimeDemo  = new TossingCoinsForDollar();
		TossingCoinsForDollar nickelDemo  = new TossingCoinsForDollar();
		
		System.out.println("Welcome to Coin Toss Simulator!\n");
			
			
			 do
			 {	
				
				quarterDemo.toss();
				dimeDemo.toss();
				nickelDemo.toss();
				
				
			    System.out.println("Quarter, Round #" + (i + 1) + ": "+ quarterDemo.getSideUp());
			    
			    		if(quarterDemo.getSideUp() == "heads")
			    		{	
					   balance += quarter;
					    i++;	
					}
			    		else
			    		    i++;	
			    		
			    		
			    
			    System.out.println("Dime, Round #" + (j + 1) + ": "+ dimeDemo.getSideUp()); 		
			    		if(dimeDemo.getSideUp() == "heads")
			    		{	
			    			balance += dime;
			    			j++;
			    		}
			    		else
			    			j++;
			    	
			    System.out.println("Nickel, Round #" + (k + 1) + ": "+ nickelDemo.getSideUp()); 			
			    		if(nickelDemo.getSideUp() == "heads")
			    		{	
			    			balance += nickel;
			    			k++;
			    		}
			    		else
			    			k++;
			    		    
			 }
			   while(balance <= 1.00);		
	
		 System.out.printf("\nThe balance is: $%1.2f\n", balance);
		 
		  if(balance == 1.00)
			  System.out.println("You win the game!");
		  else if(balance != 1.00)
			  System.out.println("You lost the game");
	}

}

	



public class CoinTossSimulatorDemo
{

	public static void main(String[] args) 
	{
		int heads = 0, tails = 0;
		
		CoinTossSimulator demo  = new CoinTossSimulator();
		
		System.out.println("Welcome to Coin Toss Simulator!\n");
		
		for(int i = 0; i < 20; i++)
		{	
		    demo.toss();
		    System.out.println("Trial #" + (i + 1) + ": "+ demo.getSideUp());
		    
		    		if(demo.getSideUp() == "heads")
				   heads++;
			   else
				   tails++;
		}
		
		System.out.println("\nThe number of times heads is facing: " + heads);
		System.out.println("The number of times tails is facing: " + tails);
		

	}

}

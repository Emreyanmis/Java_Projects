import java.util.Random;

public class FishingGameSimulation 
{
	  private final int sides = 6;
	  private int value;
	  
	  public FishingGameSimulation()
	  {
		  roll();
	  }
	  
	  public void roll()
	  {
		  Random  rand = new Random();
		  
		  value = rand.nextInt(6) + 1;
	  }
	  public int getValue()
	  {
		  return value;
	  }
  
}

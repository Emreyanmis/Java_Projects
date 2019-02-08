import java.util.Random;

public class CoinTossSimulator 
{
   private String sideUp;

   public CoinTossSimulator() 
   {
	  toss(); 
   }
   
   public void toss()
   {
	   Random rand = new Random();
	   int value;
		 
	   value = rand.nextInt(2) + 1;
	   
	   if(value == 1)
		   sideUp = "heads";
	   else
		   sideUp = "tails";
   }
   
   public String getSideUp()
   {
	   return sideUp;
   }
      
}

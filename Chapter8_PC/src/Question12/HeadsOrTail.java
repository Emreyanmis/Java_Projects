package Question12;

import java.util.Random;
public class HeadsOrTail 
{
   private int sides = 1;
   private int value;
   private String face;
   
   public HeadsOrTail()
   {
	   roll();
   }
   
   public void roll()
   {
	   Random die = new Random();
	   value = die.nextInt(2) + 1;
	   getValue();
	   
	   if(value == 1)
		   face = "Heads";
	   else if(value  == 2)
		   face = "Tails";
   }
   
   public String getFace()
   {
	   return face;
   }
   
   public int getValue()
   {
	   return value;
   }
   
}

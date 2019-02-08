package Question6;

import java.util.Random;
public class Card
{  
   
   private String suit;
   private String face;
   
   public Card() 
   {    
	  rollSuit();   
	  this.suit = suit;
	  this.face = face;
   }
   
   public String rollSuit()
   {
	   int su;
	   Random s =  new Random();
	   su = s.nextInt(4) + 1;
	   String p = null;
	   
	   if(su == 1)
		   p = "Hearts";
	   else if(su == 2)
		   p =  "Diamonds";
	   else if(su == 3)
		   p = "Spades";
	   else if(su == 4)
		   p =  "Clubs";
	   
	   return p;
   }
   
   public String rollFace()
   {
	   int su;
	   Random s =  new Random();
	   su = s.nextInt(12) + 1;
	   String p = null;
	   
	   if(su == 1)
		   p = "Ace";
	   else if(su == 2)
		   p =  "Jack";
	   else if(su == 3)
		   p = "Queen";
	   else if(su == 4)
		   p =  "King";
	   else if(su == 5)
		   p = "2";
	   else if(su == 6)
		   p = "3";
	   else if(su == 7)
		   p = "4";
	   else if(su == 8)
		   p = "5";
	   else if(su == 9)
		   p = "6";
	   else if(su == 10)
		   p = "7";
	   else if(su == 11)
		   p = "8";
	   else if(su == 12)
		   p = "9";
	   else if(su == 13)
		   p = "10";
	   else if(su == 14)
		   p = "11";
	   else if(su == 15)
		   p = "12";
 
	   return p;
	   
   }

	/**
	 * @return the suit
	 */
	public String getSuit() 
	{
		return suit;
	}
	
	/**
	 * @param suit the suit to set
	 */
	public void setSuit(String suit) 
	{
		this.suit = suit;
	}
	
	/**
	 * @return the face
	 */
	public String getFace() 
	{
		return face;
	}
	
	/**
	 * @param face the face to set
	 */
	public void setFace(String face) 
	{
		this.face = face;
	}
   
}

//  Programmed by Halis Emre Yanmis
// SubClass

public class Matches extends PointsActivity 
{
   private int numOfLose;
   private int numOfWin;
   private int numOfDraw;
   
   private int totalPoints;
   
   
   /**
    * @param w inherited from the super class
    * @param l inherited from the super class
    * @param d inherited from the super class
    */
   
   public Matches(int w, int l,int d)
   { 
	   
	   super(w, l, d);
	  
	   
	   numOfLose = l;
	   numOfWin = w;
	   numOfDraw = d;
	   totalPoints = super.getPoints();
	   
	   
	   setPoints(totalPoints);
   }
   
   
   // Getter method gets the number of win
   public int getNumOfWin()
   {
	   return numOfWin;
   }
   
   // Getter method gets the number of lose
   public int getNumOfLose()
   {
	   return numOfLose;
   }
   
   // Getter method gets the number of lose
   public int getNumOfDraw()
   {
	   return numOfDraw;
   }
}

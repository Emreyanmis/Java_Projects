// Programmed by Halis Emre Yanmis
// SuperClass
  public class PointsActivity 
  {
	    private int points;
	
	    public int win;
	    public int lose;
	    public int draw;
	
   /**
    * @param w represents the number of win( which is 3 points worth)
    * @param l represents the number of lost ( which is 0 points worth)
    * @param d represents the number of draw( which is 1 points worth)
    */
	    
   public PointsActivity(int w, int l, int d)
   {
	  int win = 3;
	  int lose = 0;
	  int draw = 1;
	  
	  
	  int totalPoints = ((w * win) + (l * lose) + (d * draw));
	  
	  System.out.println("Total points: " + totalPoints);
	  	   
   }
  
    // Setter method sets points to p 
   public void setPoints(int p)
   {
	    points = p ;
    }
   
   // Getter method returns to points
   public int getPoints()
   {
	   return points;
   } 
}

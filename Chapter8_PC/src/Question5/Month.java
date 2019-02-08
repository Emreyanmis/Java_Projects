package Question5;

public class Month 
{
   private int monthNumber;
    
   public Month()
   {
	   monthNumber = 1;
   }
   
   public Month(int monthNumber)
   {
	   if(this.monthNumber > 12 || this.monthNumber < 1)
		   monthNumber = 1;
   }
   
   public Month(String monthNumber)
   {
	   if(monthNumber.equalsIgnoreCase("January"))
		   this.monthNumber = 1;
	   else if(monthNumber.equalsIgnoreCase("February"))
		   this.monthNumber = 2;
	   else if(monthNumber.equalsIgnoreCase("March"))
		   this.monthNumber = 3;
	   else if(monthNumber.equalsIgnoreCase("April"))
		   this.monthNumber = 4;
	   else if(monthNumber.equalsIgnoreCase("May"))
		   this.monthNumber = 5;
	   else if(monthNumber.equalsIgnoreCase("June"))
		   this.monthNumber = 6;
	   else if(monthNumber.equalsIgnoreCase("July"))
		   this.monthNumber = 7;
	   else if(monthNumber.equalsIgnoreCase("August"))
		   this.monthNumber = 8;
	   else if(monthNumber.equalsIgnoreCase("September"))
		   this.monthNumber = 9;
	   else if(monthNumber.equalsIgnoreCase("October"))
		   this.monthNumber = 10;
	   else if(monthNumber.equalsIgnoreCase("November"))
		   this.monthNumber = 11;
	   else if(monthNumber.equalsIgnoreCase("December"))
		   this.monthNumber = 12;
   }
   
   public void setMonthNumber(int monthNumber)
   {
	   if(this.monthNumber > 12 || this.monthNumber < 1)
		   monthNumber = 1;   
   }
   
   public int getMonthNumber()
   {
	   return monthNumber;
   }
   
   public String getMonthName()
   {
	   String month = null;
	   
	   if(this.monthNumber == 1)
		   month = "January" ;
	   else if(this.monthNumber == 2)
		   month = "February";
	   else if(this.monthNumber == 3)
		   month = "March";
	   else if(this.monthNumber == 4)
		  month = "April";
	   else if(this.monthNumber == 5)
		   month = "May";
	   else if(this.monthNumber == 6)
		   month = "June";
	   else if(this.monthNumber == 7)
		   month = "July";
	   else if(this.monthNumber == 8)
		  month = "August"  ;
	   else if(this.monthNumber == 9)
		   month = "September";
	   else if(this.monthNumber == 10)
		   month = "October";
	   else if(this.monthNumber == 11)
		   month ="November";
	   else if(this.monthNumber == 12)
		   month = "December";
	   
	   return month;
   }
   
   public String toString()
   {
	   return "Name of the month: " + getMonthName();
   }
   
   public boolean equals(Month object2)
   {
	   boolean status;
	   
	   if(this.getMonthName() == (object2.getMonthName()))
		   status = true;
	   else
		   status = false;
	   
	   return status;   
   }
   
   public boolean greaterThan(Month object2)
   {
	  boolean status;
	   
	   if(this.getMonthNumber() > object2.getMonthNumber())
		   status = true;
	   else
		   status = false;
	   
	   return status;    
   }
   
   public boolean lessThan(Month object2)
   {
	  boolean status;
	   
	   if(this.getMonthNumber() < object2.getMonthNumber())
		   status = true;
	   else
		   status = false;
	   
	   return status; 
	   
   }
   
  
}

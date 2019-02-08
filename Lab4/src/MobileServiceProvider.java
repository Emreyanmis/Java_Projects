//Written by Halis Emre Yanmis
// Enjoy our prices for packages!  

public class MobileServiceProvider
{

   private char customerPackage;
   private int numberOfMinutesUsed;
   private double totalCharges;

   public MobileServiceProvider (char newCustomerPackage, int newNumberOfMinutesUsed)
   {
	   	customerPackage = newCustomerPackage;
	   	numberOfMinutesUsed = newNumberOfMinutesUsed;
   }

   public void setCustomerPackage (char newCustomerPackage)
   {
       customerPackage = newCustomerPackage;
   }

   /** setCustomerPackage:this method sets which customer package the user has
   @param newCustomerPackage customerPackage.
   @return does not return to something.
   */

   public void setNumberOfMinutesUsed (int newNumberOfMinutesUsed)
   {
	   numberOfMinutesUsed = newNumberOfMinutesUsed;
   }

   /** setNumberOfMinutesUsed: this method sets the minutes of calling.
   @param newNumberOfMinutesUsed numberOfMinutesUsed.
   @return does not return to something.
   */

   public char getCustomerPackage()
   {
	   return customerPackage;
   }

   /** getCustomerPackage:this method recieves the customer package that the user has
   @param no params used  for this method
   @return returns to the customer package (A, B, or C)
   */

   public int getNumberOfMinutesUsed()
   {
	   return numberOfMinutesUsed;
   }

   /** getNumberOfMinutesUsed: this method takes the number of minutes the user has been calling
   @param no params used for this method
   @return returns the number of minutes the user has called.
   */


  public double totalCharges()
  {
	  double totalCharges = 0.00;

	  if ((customerPackage == 'A') || (customerPackage == 'a'))
	  {
		  if (numberOfMinutesUsed > 450)
		     {
				 totalCharges = 39.99 + ((numberOfMinutesUsed - 450) * 0.45);
		     }

		  else
		  {
		     totalCharges = 39.99;
	      }
      }

      if ((customerPackage == 'B') || (customerPackage == 'b'))
      {
		 if (numberOfMinutesUsed > 900)
		  {
		    totalCharges = 59.99 + ((numberOfMinutesUsed - 900) * 0.4);
	      }

	     else
	     {
			totalCharges = 59.99;
	     }
      }

      if ((customerPackage == 'C') || (customerPackage == 'c'))
      {
		totalCharges = 69.99;
      }

      return totalCharges;

  }


}

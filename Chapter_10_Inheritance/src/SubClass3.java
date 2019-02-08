
public class SubClass3 extends SuperClass3
{
	
	/**
	 * This method overrides one of the methods
	 * @param arg An int.
	 */
    
	 public void showValue(int arg)
	 {   
		 // super.showValue(arg);  calls the overridden superclass method
		 System.out.println("Subclass: The int argument was " +arg);
	 }
     
     /**
      * This method overloads the superclass methods
      * @param arg A double.
       */

      public void showValue(double arg)
      {
    	      System.out.println("Subclass: The double argument was " +arg);
      }
	 
}

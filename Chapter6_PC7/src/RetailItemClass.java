
public class RetailItemClass 
{
   private String description;
   private int unitOnHand;
   private double price;
   
   public RetailItemClass(String description, int unitsOnHand, double price)
   {
	   this.description = description;
	   this.unitOnHand = unitsOnHand;
	   this.price = price;
   }

   /**
    * @return the description
    */
   public String getDescription() 
   {
	   return description;
   }

   /**
    * @param description the description to set
    */
   public void setDescription(String description) 
   {
	   this.description = description;
   }

   /**
    * @return the unitOnHand
    */
   public int getUnitOnHand() 
   {
	   return unitOnHand;
   }

	/**
	 * @param unitOnHand The unitOnHand to set
	 */
	public void setUnitOnHand(int unitOnHand) 
	{
		this.unitOnHand = unitOnHand;
	}
	
	/**
	 * @return The price
	 */
	public double getPrice() 
	{
		return price;
	}
	
	/**
	 * @param price The price to set
	 */
	public void setPrice(double price) 
	{
		this.price = price;
	}	
}

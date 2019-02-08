package Question6;

public class CashRegistrer 
{
	private int quantityItems;
	private RetailItemClass object;


	
	public CashRegistrer(RetailItemClass object,int quantityItems)
	{   
		this.object =  new RetailItemClass(object);
		this.quantityItems = quantityItems;
	}
	
	public double getSubtotal()
	{
		return quantityItems * object.getPrice();
	}
	
	public double getTax()
	{
		return getSubtotal() * (6.00 / 100.00);
	}
	
	public double getTotal()
	{
		return getTax() + getSubtotal();
	}
	
	public String toString()
	{
		return "Subtotal of the sale: $" + getSubtotal() + "\nAmount of sales on the purchase: $" +
				getTax() + "\nTotal of the sale: $" + getTotal();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

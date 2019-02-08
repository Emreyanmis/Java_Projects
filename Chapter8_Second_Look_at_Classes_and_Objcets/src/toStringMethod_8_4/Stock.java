package toStringMethod_8_4;

public class Stock
{
    private String symbol;
    private double sharePrice;
    
	public Stock(String symbol, double sharePrice) 
	{
		this.symbol = symbol;
		this.sharePrice = sharePrice;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() 
	{
		return symbol;
	}

	/**
	 * @return the sharePrice
	 */
	public double getSharePrice() 
	{
		return sharePrice;
	}
	
	public String toString()
	{
		return "Trading symbol of stock: " + symbol + "\nCurrent price per share: " + sharePrice;  
	}
	
	
    
    
}

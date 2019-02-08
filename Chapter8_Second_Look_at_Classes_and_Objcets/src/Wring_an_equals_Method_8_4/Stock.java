package Wring_an_equals_Method_8_4;

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
	
	public boolean equals(Stock object2)
	{
		boolean status;
		
		if((symbol.equals(object2.symbol)) && (sharePrice == object2.sharePrice))
			status = true;
		else
			status = false;
		
		return status;
	}
	
	public String toString()
	{
		return "Trading symbol of stock: " + symbol + "\nCurrent price per share: " + sharePrice;  
	}
	
	
    
    
}

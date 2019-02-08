package Class_Collaboration_8_11;

public class Stock1
{
    private String symbol;
    private double sharePrice;
    
	public Stock1(String symbol, double sharePrice) 
	{
		this.symbol = symbol;
		this.sharePrice = sharePrice;
	}
	
	public Stock1(Stock1 object2)
	{
		symbol = object2.symbol;
		sharePrice = object2.sharePrice;
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
	
	public boolean equals(Stock1 object2)
	{
		boolean status;
		
		if((symbol.equals(object2.symbol)) && (sharePrice == object2.sharePrice))
			status = true;
		else
			status = false;
		
		return status;
	}
	
	public Stock1 copy()
	{
		Stock1 copyObject = new Stock1(symbol, sharePrice);
		return copyObject;
	}
	
	
	public String toString()
	{
		return "Trading symbol of stock: " + symbol + "\nCurrent price per share: " + sharePrice;  
	}
	
	
    
    
}
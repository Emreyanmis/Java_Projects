package Class_Collaboration_8_11;

public class StockPurchase 
{
	private Stock1 stock;
	private int shares;
	
	public StockPurchase(Stock1 stockObject, int shares) 
	{
		
		stock = new Stock1(stockObject);
		this.shares = shares;
		
	}

	/**
	 * @return the stock
	 */
	public Stock1 getStock1() 
	{
		return new Stock1(stock);
	}

	/**
	 * @return the shares
	 */
	public int getShares() 
	{
		return shares;
	}
	
	public double getCost()
	{
		return shares * stock.getSharePrice();
	}
	
	
	
	

}

package Enumareted_Types_8_9;

public class SportsCar 
{ 
	private CarType make;
	private CarColor color;
	private double price;
	
	public SportsCar( CarType make, CarColor color, double price) 
	{
		this.make = make;
		this.color = color;
		this.price = price;
	}

	/**
	 * @return the make
	 */
	public CarType getMake() {
		return make;
	}

	/**
	 * @return the color
	 */
	public CarColor getColor() {
		return color;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return String.format("Make: %s\nColor: %s\nPrice: $%,.2f", make, color, price);
	}

}

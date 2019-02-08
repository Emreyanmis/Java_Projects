package Question3;

public class RoomCarpet 
{
	private RoomDimension size;
	private double carpetCost;
	
	public RoomCarpet(RoomDimension size, double carpetCost) 
	{
		this.size = new RoomDimension(size);
		this.carpetCost = carpetCost;
	}
	
	public double getTotalCost()
	{
		return size.getArea() * carpetCost;
	}
	
	public String toString()
	{
		return "Total cost: $" + getTotalCost();
	}
	

}

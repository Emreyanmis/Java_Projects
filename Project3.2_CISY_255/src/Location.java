
public class Location implements Comparable<Location>

{
	private String description;
	private LinkedBag<Location> neighbors;
	
	public Location(String description) 
	{
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() 
	{
		return description;
	}
	
	public boolean isNeighbors(Location otherLocation)
	{
		return neighbors.exists(otherLocation);
	}
	
	public int compareTo(Location otherLocation)
	{
		return 0;
	
	
	}
	public boolean equals(Location otherLocation)
	{
		return false;
		
	}
	
	


	
	
	
	

}

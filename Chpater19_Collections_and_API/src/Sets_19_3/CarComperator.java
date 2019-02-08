package Sets_19_3;

import java.util.Comparator;
public class CarComperator implements Comparator<Car>
{
	public int compare(Car car1, Car car2)
	{
		// Get the two cars' VINs.
		String vin1 = car1.getDescription();
		String vin2 = car2.getVin();
	
	
		// Compare the VINs and return the result of the comparison.
		return vin1.compareToIgnoreCase(vin2);
	}
}

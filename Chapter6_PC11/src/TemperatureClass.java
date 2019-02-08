
public class TemperatureClass
{
	private double ftemp;

	public TemperatureClass(double ftemp) 
	{	
		this.ftemp = ftemp;
	}
	
	public void setFahrenheit(double fahrenheit)
	{
		ftemp = fahrenheit;
	}
	
	public double getFahrenheit()
	{
		return ftemp;
	}
	
	public double getCelcius()
	{
		return (5.0 / 9.0) * (ftemp - 32.0);
	}
	
	public double getKelvin()
	{
		return (( 5.0 / 9.0) * (ftemp - 32) + 273);
	}

}

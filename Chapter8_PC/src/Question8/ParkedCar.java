package Question8;

public class ParkedCar 
{
	private String make;
	private int model;
	private String color;
	private String licenseNumber;
	private int numTimesParked;
	
	public ParkedCar(String make, int model, String color, String licenseNumber, int numTimesParked) 
	{
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.numTimesParked = numTimesParked;
	}

	public ParkedCar(ParkedCar object2) 
	{
		this.make = object2.make;
		this.model = object2.model;
		this.color = object2.color;
		this.licenseNumber = object2.licenseNumber;
		this.numTimesParked = object2.numTimesParked;
    }

	/**
	 * @return the make
	 */
	public String getMake() 
	{
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) 
	{
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public int getModel()
	{
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(int model)
	{
		this.model = model;
	}

	/**
	 * @return the color
	 */
	public String getColor() 
	{
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) 
	{
		this.color = color;
	}

	/**
	 * @return the licenseNumber
	 */
	public String getLicenseNumber() 
	{
		return licenseNumber;
	}

	/**
	 * @param licenseNumber the licenseNumber to set
	 */
	public void setLicenseNumber(String licenseNumber) 
	{
		this.licenseNumber = licenseNumber;
	}

	/**
	 * @return the numTimesParked
	 */
	public int getNumTimesParked() 
	{
		return numTimesParked;
	}

	/**
	 * @param numTimesParked the numTimesParked to set
	 */
	public void setNumTimesParked(int numTimesParked) 
	{
		this.numTimesParked = numTimesParked;
	}
	
	public String toString()
	{
		return "Make: " + make + "\nModel: " + model + "\nColor: " + color +
				"\nLicense Number: " + licenseNumber + "\nNumber of minutes that the " +
			    "car has been parked: " + numTimesParked;
	}

}

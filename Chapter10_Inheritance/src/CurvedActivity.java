
public class CurvedActivity extends GradedActivity
{
	private double rawScore;
    private double percentage;
    
    public CurvedActivity(double percent)
    {
    		percentage = percent;
    		rawScore = 0.0;
    }
    
    public void setScore(double s)
    {
    		rawScore = s;
    		super.setScore(rawScore * percentage);
    }

	/**
	 * @return the rawScore
	 */
	public double getRawScore() 
	{
		return rawScore;
	}

	/**
	 * @return the percentage
	 */
	public double getPercentage() 
	{
		return percentage;
	}
    
}

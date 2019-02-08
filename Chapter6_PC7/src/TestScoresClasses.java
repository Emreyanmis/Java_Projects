
public class TestScoresClasses 
{
	private int test1;
	private int test2;
	private int test3;
	
	public TestScoresClasses(int test1, int test2, int test3) 
	{
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
	}

	/**
	 * @return the test1
	 */
	public int getTest1() 
	{
		return test1;
	}

	/**
	 * @param test1 the test1 to set
	 */
	public void setTest1(int test1) 
	{
		this.test1 = test1;
	}

	/**
	 * @return the test2
	 */
	public int getTest2() 
	{
		return test2;
	}

	/**
	 * @param test2 the test2 to set
	 */
	public void setTest2(int test2) 
	{
		this.test2 = test2;
	}

	/**
	 * @return the test3
	 */
	public int getTest3() 
	{
		return test3;
	}

	/**
	 * @param test3 The test3 to set
	 */
	public void setTest3(int test3) 
	{
		this.test3 = test3;
	}
	
	public int getAverage()
	{
		return (test1 + test2 + test3) / 3;
	}

}

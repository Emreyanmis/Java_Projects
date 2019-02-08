package Question4;

public class MonthDemo 
{

	public static void main(String[] args) throws InvalidMonthNumber
	{
		
		Month demo1 = new Month(10);
		Month demo2 = null;
		try 
		{
			demo2 = new Month("March");
		} catch (InvalidMonthName e)
		{
			e.printStackTrace();
		}
		
		System.out.println(demo1.equals(demo2));
		System.out.println(demo1.greaterThan(demo2));
		System.out.println(demo1.lessThan(demo2));

		
	}

}

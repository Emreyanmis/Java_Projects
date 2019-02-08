
public class Question3
{

	public static void main(String[] args)
	{
		int num = 0;
		showMe(num);

	}
	
	public static void showMe(int arg)
	{
		if(arg < 10)
			showMe(arg + 1);
		else
			System.out.println(arg);
	}

}

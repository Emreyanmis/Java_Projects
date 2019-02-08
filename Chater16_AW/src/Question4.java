
public class Question4 
{

	public static void main(String[] args)
	{
		int num = 0;
		showMe(num);
	}
	public static void showMe(int arg)
	{
		System.out.println(arg);
		
		if(arg < 10)
			showMe(arg + 1);
	}

}

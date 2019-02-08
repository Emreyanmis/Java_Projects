
public class Question4 
{

	public static void main(String[] args)
	{
	   String[] countries = {"Turkey", "France","Germany","Holland","USA","England","Egypt","Spain","Italy","Sweeden",
			                "Japan","China"};
	   Double[] populations = {214124124.89, 14312424.43, 42134123412.90, 132413421.4, 12341341.65, 3452346.45, 32452345.65,
			                  64674657654.76, 3456346543.67, 3643563465.76, 3456365.65 , 45634563.65};
	   
	   for(int i = 0; i < countries.length; i++)
	      System.out.println(countries[i] + " population: "+ populations[i]);  
	}
}

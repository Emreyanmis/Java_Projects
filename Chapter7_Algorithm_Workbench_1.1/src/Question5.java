
public class Question5
{

	public static void main(String[] args) 
	{
	    int[] employeesID = { 43534, 23452, 34525, 23452, 23453, 23455, 32452, 45234, 52345, 34525};
	    
	    double[] grossPay = {23452345.34, 4352345.54, 2345234.00 , 34252345, 2345435 ,53444.999, 32432141,
	    		                 352345423.00, 3425243.44 , 23452345234.43234 };
	    
        for(int i = 0; i < employeesID.length; i++)
            System.out.println("employee #" + (i + 1) + " ID: " + "and gross pay: " + grossPay[i]); 
	}

}

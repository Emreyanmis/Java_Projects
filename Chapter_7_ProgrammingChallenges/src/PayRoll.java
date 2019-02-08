import java.util.Scanner;

public class PayRoll 
{

		int[] employeeID = {5658845,4520125,7895122,8777541,
				            8451277,1302850,7580489};
        
		// Number of hours worked by each employee
		private int[] hours = new int[7];
		
		// each employee's hourly pay rate
		private double[] payRate = new double[7];
		
		// each employee's gross wages
		private double[] wages = new double[7];
		
		// accessor and mutator methods
		
		// returns id of index
		public int getEmployeeID(int i)
		{
			return employeeID[i];
			
		}
		
		// returns hours 
		public int getHours(int i)
		{
			return hours[i];
		}
		
		// returns pay rate
		public double getPayRate(int i)
		{
			return payRate[i];
		}
		
		// returns wages
		public double getWages(int i)
		{
			return wages[i];
		}
		
		//sets ID
		public void setEmployeeID(int i, int ID)
		{
			employeeID[i] = ID;
		}
		
		// sets Hours
		public void setHours(int i, int hour)
		{
			hours[i] = hour;
		}
		
		// Set Pay rate 
		public void setPayRate(int i, double payrate)
		{
			payRate[i] = payrate;
		}
		
		// sets wages
		public void setWages(int i, double wage)
		{
			wages[i] = wage;
		}
	
        // gross pay for each employee with identification
		
		public double calculateGrossPay(int  theEmployeeID)
		{
			double grossPay = 0;
			int employeeIndex = -1; // index of the employee
			for(int i = 0; i < employeeID.length;i++)
			{
				if(employeeID[i] == theEmployeeID)
				{
					employeeIndex = i;
					break;
				}
			}
			
			// if the employee was found
			// the gross pay is
			if(employeeIndex != -1)
			{
				int h = hours[employeeIndex];
				double r = payRate[employeeIndex];
				grossPay = (h * r); 
			}		
			return grossPay;
		}

	}


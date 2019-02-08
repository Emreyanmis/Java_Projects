import java.util.Scanner;

public class ArrayDemo2 
{

	public static void main(String[] args) 
	{
		int numEmployees = 3;
		int[] employees = new int [numEmployees];
		int total = 0;
		int average = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
	   System.out.println("The the number of employees " + numEmployees);
	   numEmployees = keyboard.nextInt();
	   
	   for(int i = 0; i < employees.length; i++)
	   {
		   System.out.print("Employee #" + (i + 1) + " age :");
		   employees[i] = keyboard.nextInt();
		   
	   }		
	   
	   for(int i = 0; i < employees.length; i++)
	   {
		   total += employees[i];
		   average = total / employees.length;	   
	   }
	   
	   System.out.println("total is: " + total);
	   System.out.print("average is: " + average);
		   
	   
	}

}

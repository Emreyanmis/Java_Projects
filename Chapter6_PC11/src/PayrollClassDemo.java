import java.util.Scanner; // The scanner class 

public class PayrollClassDemo 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int idNumber;
		int hpr;
		int nohw;
				
		System.out.print("Enter your name: ");
		name = keyboard.nextLine();			
		System.out.print("Enter your ID Number: ");
		idNumber = keyboard.nextInt();	
		System.out.print("Enter number of hours you worked: ");
		hpr = keyboard.nextInt();			
		System.out.print("Enter your hourly pay rate:  $");
		nohw = keyboard.nextInt();			
		PayrollClass employee1 = new PayrollClass(name, idNumber, hpr, nohw);
			
		System.out.println("\nName\t\t" + "ID Number\t\t" + "Number of Hours Worked\t\t"
					+ " Hourly Pay Rate $\t\t" + "Payroll $");
		System.out.println("==========================================================="
								+ "======================================"
								+ "============================");
		System.out.println(employee1.getName() + "\t\t" + employee1.getIdNumber() + "\t\t\t"
					         + employee1.getNumOfHoursWorked() + "\t\t\t\t" +  employee1.getHourlyPayRate()
					         + "\t\t\t\t" + employee1.getSalary());
		}
	}



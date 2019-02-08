
public class EmployeeDemo 
{

	public static void main(String[] args) 
	{
		String name;
		int idNumber;
		String department;
		String position;
		
		Employee worker1 = new Employee();
		Employee worker2 = new Employee();
		Employee worker3 = new Employee();
		
		
		worker1.setName("Susan Meyers");
		worker2.setName("Mark Jones");
		worker3.setName("Joy Rogers");
		
		worker1.setIdNumber(47899);
		worker2.setIdNumber(39119);
		worker3.setIdNumber(81774);
		
		worker1.setDepartment("Accounting");
		worker2.setDepartment("IT");
		worker3.setDepartment("Manufacturing");
		
		worker1.setPosition("Vice President");
		worker2.setPosition("Programmer");
		worker3.setPosition("Engineer");

		System.out.println("Name" +"            " + "ID Number" + "            " + "Department" 
		                  +"             " + "Position");
		
		System.out.println("============================================================="
				+ "========");
		
		System.out.println(worker1.getName() + "        " + worker1.getIdNumber() + "         "
		                  + worker1.getDepartment() + "         "+ worker1.getPosition());
		
		System.out.println(worker2.getName() + "          " + worker2.getIdNumber() + "         "
                + worker2.getDepartment() + "                 "+ worker2.getPosition());
		
		System.out.println(worker3.getName() + "          " + worker3.getIdNumber() + "         "
                + worker3.getDepartment() + "      "+ worker3.getPosition());

	}

}

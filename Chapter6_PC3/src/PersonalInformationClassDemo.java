
public class PersonalInformationClassDemo
{

	public static void main(String[] args) 
	{
		PersonalInformationClass person1 = new PersonalInformationClass("Emre","155 Vasser Dr.", 19,857260947);
		PersonalInformationClass person2 = new PersonalInformationClass("Sevde","48 Barlet Ave.", 20,835145453);
		PersonalInformationClass person3 = new PersonalInformationClass("Mert"," 3221 Yasakment Ave.", 5,532660902);
		
		System.out.println("Name\t\t\t" +"Adress\t\t\t"+ "Age\t\t\t" + "Phone Number");
		System.out.println("======================================================="
						 + "==============================");
		System.out.println(person1.getName() +"\t\t\t" + person1.getAddress()+"\t\t" +
		                   person1.getAge() + "\t\t\t"+ person1.getPhoneNumber());
		
		System.out.println(person2.getName() +"\t\t\t" + person2.getAddress()+"\t\t" +
                person2.getAge() + "\t\t\t"+ person2.getPhoneNumber());
		
		System.out.println(person3.getName() +"\t\t"+"       " + person3.getAddress()+"\t" +
                person3.getAge() + "\t\t\t"+ person3.getPhoneNumber());
	}

}

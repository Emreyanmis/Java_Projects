
public class PetDemo 
{

	public static void main(String[] args) 
	{
		Pet pet1 = new Pet();
		Pet pet2 = new Pet();
		Pet pet3 = new Pet();
	
		
		pet1.setAnimal("Dog");
		pet1.setAge(3);
		pet1.setName("Josh");
		
		pet2.setAge(4);
		pet2.setAnimal("Cat");
		pet2.setName("Jess");
		
		pet3.setAge(5);
		pet3.setAnimal("Bird");
		pet3.setName("Papo");
		
		System.out.println("Here is the information about the pets:");
		System.out.println("Animal\t\t\tName\t\t\tAge");
		System.out.println("====================================================");
		System.out.println(pet1.getAnimal() + "\t\t\t" + pet1.getName() + "\t\t\t"  + pet1.getAge());
		System.out.println(pet2.getAnimal() + "\t\t\t" + pet2.getName() + "\t\t\t" + pet2.getAge());
		System.out.println(pet3.getAnimal() + "\t\t\t" + pet3.getName() + "\t\t\t" + pet3.getAge());
		
		
	

	}

}

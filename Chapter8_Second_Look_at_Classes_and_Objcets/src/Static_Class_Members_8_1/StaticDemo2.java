package Static_Class_Members_8_1;

public class StaticDemo2
{

	public static void main(String[] args) 
	{
		int objectCount;
		
		Countable1 object1 = new Countable1();
		Countable1 object2 = new Countable1();
		Countable1 object3 = new Countable1();

		objectCount = object1.getInstanceCount();
		System.out.println(objectCount + " instances of the class were created.");
		
		objectCount = object2.getInstanceCount();
		System.out.println(objectCount + " instances of the class were created.");
		
		objectCount = object3.getInstanceCount();
		System.out.println(objectCount + " instances of the class were created.");


	}

}

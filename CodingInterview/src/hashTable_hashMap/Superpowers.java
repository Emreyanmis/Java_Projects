package hashTable_hashMap;

public class Superpowers 
{

	public static void main(String[] args)
	{
	   Water water = new Water();
	   water.display("First call");
	   
	   new Fire(water, "Hey");
	   new Fire(water, "What's up?");
	}

}

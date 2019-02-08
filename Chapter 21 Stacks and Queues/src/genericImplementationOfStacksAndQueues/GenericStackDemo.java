package genericImplementationOfStacksAndQueues;

public class GenericStackDemo
{

	public static void main(String[] args) 
	{
		GenStack<String>  st = new GenStack<String>(5);
		st.push("George");
		st.push("Washington");
		
		System.out.println(st.pop());
		System.out.println(st.pop());

	}

}

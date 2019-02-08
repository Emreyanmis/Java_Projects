package question1;



public class DoubleEndedQueueDemo 
{

	public static void main(String[] args) 
	{
		
		DoubleEndedQueue demo = new DoubleEndedQueue();
		
	
		demo.addFront("emre");
		demo.addRear("mert");
		
		
		String str = "The contents of the list";
		System.out.println(str + "\n" + demo);
		
		demo.addFront("murat");
		
		System.out.println("\nThe new content of the list: \n"  + demo);
		
		
		demo.removeFront();
		System.out.println("\nThe new content of the list: \n"  + demo);
		
		demo.removeRear();
		System.out.println("\nThe new content of the list: \n"  + demo);
	
	}

}

package linkedListImplementationOfQueues;

public class LinkedQueueDemo 
{

	public static void main(String[] args) 
	{
		 LinkedQueue queue = new LinkedQueue();
		 
		 String[] names = {"EMRE", "MUSA", "ALP","MERT"};
		 
		   System.out.println("Adding names: ");
		   for(String s: names)
		   {
			   System.out.println(s + " ");
			   queue.enqueue(s);
		   }
		   
		   System.out.println("\nState of queue is: ");
		   System.out.println(queue);
		   
		   System.out.println("Removing  2 names: ");
		   queue.dequeue();
		   queue.dequeue();
		   System.out.println("\nState of queue is: ");
		   System.out.println(queue);
		   
		   
		   System.out.println("\nAdding the names Elaine");
		   queue.enqueue("Elaine");
		   
		   System.out.println("\nState of queue is: ");
		   System.out.println(queue);
		 

	}

}

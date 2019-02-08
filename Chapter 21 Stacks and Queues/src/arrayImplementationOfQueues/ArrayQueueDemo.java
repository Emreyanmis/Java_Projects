package arrayImplementationOfQueues;

public class ArrayQueueDemo
{

	public static void main(String[] args) 
	{
	   String str;
	   
	   ArrayQueue queue = new ArrayQueue(10);
	   str = "Queue has capacity ";
	   System.out.println(str + queue.capacity());
	   
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

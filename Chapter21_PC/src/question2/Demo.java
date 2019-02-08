package question2;

public class Demo 
{

	public static void main(String[] args) 
	{
		ArrayBasedDeque  demo = new ArrayBasedDeque (10);
		
		 String[] names = {"EMRE", "MUSA", "ALP","MERT"};
		   
		 System.out.println("Adding names: ");
		   for(String s: names)
		   {
			   System.out.println(s + " ");
			   demo.enqueueFront(s);
		   }
		   
		 System.out.println("\nThe content of the array: " + demo);  
		 
		 System.out.println("\n\nAdding new name didar to the beginning:");
		 demo.enqueueFront("didar");
		 demo.enqueueRear("pez");
		 demo.enqueueRear("pez2");
		 demo.enqueueRear("pez3");
		 
		 System.out.println("\nThe content of the array: " + demo);  
		 
		 System.out.println("\n\nRemoving names:");
		 
		 demo.dequeueRear();
		 System.out.println("\nThe content of the array: " + demo); 
		 

		 System.out.println("\n\nRemoving names:");
		 
		 demo.dequeueRear();
		 System.out.println("\nThe content of the array: " + demo); 
		 
		 System.out.println("\n\nRemoving names:");
		 
		 demo.dequeueFront();
		 demo.dequeueFront();
		 
		 System.out.println("\nThe content of the array: " + demo); 
		 
		
		 
		

	}

}

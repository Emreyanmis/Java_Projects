package introducttionToLinkedList;

public class LinkedListExample1 
{
	private class Node
	{
		String value;
		Node next;
		
		Node(String value, Node next)
		{
			this.value = value;
			this.next = next;
		}
		
		/*
		 * Constructor 
		 * @param value The element to store in this node
		 */
		Node(String value)
		{
			this.value = value;
			next = null;
		}
	 }	
		// Reference to the first node in the list 
		private Node first = null;
		
		/**
		 * Constructor.
		 * Builds a linked list
		 */
		
		public LinkedListExample1()
		{
			first = new Node("Emre");
			first.next = new Node("Yakup");
			first.next.next = new Node("Batu");
			first = new Node("Ihsan", first);
			
			String names[] = {"Cemre", "Merve"};
			
			for(String s: names)
				first = new Node(s, first);
			
		}
		
		public void print()
		{
			Node ref =  first;
			
			while(ref != null)
			{
				System.out.print(ref.value + " ");
				ref = ref.next;
			}
		}
}

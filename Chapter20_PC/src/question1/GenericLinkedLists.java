package question1;

import java.util.List;
import java.util.*;

public class GenericLinkedLists<E extends Number> 
{
	
		/**
		 * The Node class stores a list element and 
		 * a reference to the next node
		 */
		
		private class Node<E>
		{
			E value;				// Value of a list element
			Node<E> next;					// Next node in the list
			Node<E> prev;					// Previous node in the list
			
			/**
			 * Constructor.
			 * @param val The element  to be stored in the node
			 * @param n The reference to the successor node.
			 * @param p The reference to the predecessor node.
			 */
			
			Node(E val, Node<E> n, Node<E> p)
			{
				value = val;
				next = n;
				prev = p;
			}
		    
			/**
			 * Constructor.
			 * @param The element to be stored in the node
			 */
			
			Node(E val)
			{
				// Just call the other (sister) constructor.
				this(val, null, null);
			}
			
		}
		
		// Head of the list
		private Node<E> first;	
		
		// Tail of the list
		private Node<E> last;
		
		/**
		 * constructor
		 */
		
		public GenericLinkedLists()
		{
			first = null;
			last = null;
		}
		
		/**
		 * The isEmpty method checks to see if the list is empty.
		 * @return true if list is empty, false otherwise
		 */
		
		public boolean isEmpty()
		{
			return first == null;
		}
		
		/**
		 * The size method returns the length of the list.
		 * @return The number of elements in the list
		 */
		
		public int size()
		{
			int count  = 0;
			Node<E> p = first;
			while(p != null)
			{
				// There is an element at p
				count++;
				p = p.next;
			}
			
			return count;	
		}
		
	    /**
	     * The add method adds to the end of the list.
	     * @param e The value to add
	     */
		
		public void add(E e)
		{
			if(isEmpty())
			{
				first = new Node<E>(e);
				last = first;
			}
			else
			{
				// Add to the end of existing list
				last.next = new Node<E>(e, null, last);
				last = last.next;
			}
		}
		
		
		/**
		 * This add method adds an element at an index 
		 * @param e The element to add to the list
		 * @param index The index at which to add
		 * @exception IndexOutOfBoundsException When the index is out of bounds
		 */
		
		public void add(int index, E e)
		{
			if(index < 0 || index > size())
			{
				String message = String.valueOf(index);
				throw new IndexOutOfBoundsException(message);
			}
			
			// Index is at least 0
			if(index == 0)
			{
				// New element goes at beginning
				Node<E> p = first; 
				first = new Node<E>(e, p, null);
				if(p != null)
				  p.prev = first;
				if(last == null)
					last = first;
				return;	
			}
			
			// pred will point to the predecessor of the new node.
			Node<E> pred = first;
			for(int k =1; k <= index - 1; k++)
				pred = pred.next;
			
			// Splice in a node with the new element 
			// We want to go from pred -- succ to pred -- middle-- succ
			Node<E> succ = pred.next;
			Node<E> middle = new Node<E>(e, succ, pred);
			pred.next = middle;
			if(succ == null)
				last = middle;
			else 
				succ.prev = middle;
		}
		
		/**
		 * The toString method computes the string representation of the list.
		 * @return The string representation of the linked list.
		 */
		
		public String toString()
		{
			StringBuilder strb= new StringBuilder();
			
			// Use a p to walk down the linked list
			Node<E> p = first;
			while(p != null)
			{
				strb.append(p.value + " ");
				p = p.next;
			}
			
			return strb.toString();
		}
		
		/**
		 * The remove method removes the element at a given position
		 * @param index The position of the element to remove
		 * @return The element removed
		 * @exception IndexOutOfBoundsException When the index is out of bounds
		 */
		
		public E remove(int index)
		{
			if(index < 0 || index > size())
			{
				String message = String.valueOf(index);
				throw new IndexOutOfBoundsException(message);
			}

		
		// Locate the node targeted for removal
		Node<E> target = first;
		for(int k = 1; k <= index; k++)
			target = target.next;
		
		E element = target.value;
		Node<E> pred = target.prev;
		Node<E> succ  = target.next;
		
		// Route forward and back pointers around the node to be removed
		if(pred == null)
			first = succ;
		else
			pred.next = succ;
		
		if(succ == null)
			last = pred;
		else
			succ.prev = pred;
		
		return element;	
		}
		
		
		/**
		 * The remove method removes an element from the list.
		 * @param element The element to remove
		 * @return true if the element was removed, false otherwise
		 */
		
		public boolean remove(E element)
		{
			if(isEmpty())
				return false;
			
			// Locate the node targeted for removal
			Node<E> target = first;
			while(target != null && !element.equals(target.value))
			{
				target = target.next;
			}
			
			if(target == null)
				return false;
			
			Node<E> pred = target.prev;
			Node<E> succ = target.next;
			
			// Route forward and back pointers around the node to be removed
			if(pred == null)
				first = succ;
			else
				pred.next = succ;
			
			if(succ == null)
				last = pred;
			else
				succ.prev = pred;
				
			return true;
		}
		
		
		public void clear()
		{
			if(isEmpty())
				System.out.println("The list is already empty");
			
			Node<E> p = first;
			while(!isEmpty())
			{
				remove(0);
				p = p.next;
			}
					
		}
		
		public E get(int index)
		{
			if(index < 0 || index > size())
			{
				String message = String.valueOf(index);
				throw new IndexOutOfBoundsException(message);
			}
			
			// Locate the node targeted for its index
			Node<E> target = first;
			for(int k = 1; k <= index; k++)
				target = target.next;
			
			return target.value;		
		}
		
		public E set(int index, E element)
		{
			if(index < 0 || index > size())
			{
				String message = String.valueOf(index);
				throw new IndexOutOfBoundsException(message);
			}
			
			// Locate the node targeted for its index
			Node<E> target = first;
			for(int k = 1; k <= index; k++)
				target = target.next;
			
			E val = target.value;
			target.value = element;
			
			return val;
		}
		
}

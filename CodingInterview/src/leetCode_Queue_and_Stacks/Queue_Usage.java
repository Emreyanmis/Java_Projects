package leetCode_Queue_and_Stacks;

import java.util.LinkedList;
import java.util.Queue;
public class Queue_Usage{
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		// peek() is used to retrieve the head of the queue
		System.out.println("The first element is: " + q.peek());
		
		//add() is used to add elements to the queue
		q.add(9);
		q.add(2);
		q.add(5);
		
		// Alternatively, offer() is utilized to add elements to the queue as well.
		q.offer(3);
		q.offer(6);
		
		// poll() returns the head of the queue, then removes the head from the queue
		System.out.println("The first element is: " + q.poll());
		System.out.println("The first element is: " + q.poll());
		
		System.out.println("The first element is: " + q.peek());
		
		// size() returns the length of this queue
		System.out.println("The size of the queue is: " + q.size());
	}
}
package leetCode_Queue_and_Stacks;


class MyCircularQueue{
	private int[] data;
	private int head;
	private int tail;
	private int size;
	
	public MyCircularQueue(int k) {
		data = new int[k];
		head = -1;
		tail = -1;
		size = k;
	}
	
	public boolean enEnqueue(int value) {
		if(isFull() == true)
			return false;
		if(isEmpty() == true)
			return false;
		tail = (tail + 1) % size;
		data[tail] = value;
		return true;
	}
	
	public boolean deQueue() {
		if(isEmpty() == true)
			return false;
		if(head == tail){
			tail = -1;
			head = -1;
			return true;
		}
		head = (head + 1) % size;
		return true;
	}
	
	public int Front() {
		if(isEmpty() == true)
			return -1;
		return data[head];
	}
	public int Rear() {
		if(isEmpty() == true)
			return -1;
		return data[tail];
	}

	public boolean isEmpty() {	
		return head == -1;
	}

	public boolean isFull() {
		return ((tail + 1) % size) == head; 
	}
}
public class Circular_Queue{
	public static void main(String[] args) {
		MyCircularQueue obj = new MyCircularQueue(7);
		boolean param_1 = obj.enEnqueue(2);
		boolean param_2 = obj.enEnqueue(5);
		
		boolean param_3 = obj.deQueue();
		
		int param_4 = obj.Front();
		int param_5 = obj.Rear();
		
		boolean param_6 = obj.isEmpty();
		boolean param_7 = obj.isFull();	
	}
}

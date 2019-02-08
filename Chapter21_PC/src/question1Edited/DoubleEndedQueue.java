package question1Edited;

import java.util.LinkedList;

public class DoubleEndedQueue 
{
	private LinkedList<String> list;
	
	public DoubleEndedQueue()
	{
		list = new LinkedList<String>();
	}
	public void addFront(String x)
	{
		list.addFirst(x);
	}
	
	public void addRear(String x)
	{
		list.addLast(x);
	}
	
	public String removeFront()
	{
		if(list.isEmpty())
			return " ";
		else
			return list.removeFirst();
	}
	
	public String removeRear()
	{
		if(list.isEmpty())
			return " ";
		else
			return list.removeLast();
	}
	public int size()
	{
		return list.size();
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public String toString()
	{
		String str = "";
		
		for(int i = 0; i < list.size(); i++)
			str += list.get(i) + "\n";
		
		return str;
	}
}

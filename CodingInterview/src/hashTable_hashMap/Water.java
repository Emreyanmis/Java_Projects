package hashTable_hashMap;



public class Water 
{
	 public synchronized static void display(String m)
	 {
		 System.out.print("[" + m);
		 
		 try
		 {
			 Thread.sleep(1000);	 
		 }
		 catch(InterruptedException ie)
		 {
			 System.out.println("Exception encounterd");
		 } 
		 System.out.println("]");	 
	 }
}

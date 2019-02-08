package hashTable_hashMap;

public class Fire implements Runnable
{
	 Thread t;
	 Water w1;
	 String s;
	 
	 Fire(Water w1, String s)
	 {
		 this.w1 = w1;
		 this.s = s;
		 t = new Thread(this, "Second Thread");
		 t.start();
	 }
	 
	 public void run()
	 {
		 w1.display(s);
	 }
	 
}

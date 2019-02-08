package RecursionOnTheLinkedLists;

public class RLinkedListDemo
{
	
  public static void main(String[] args)
  {
	  RLinkedList demo = new RLinkedList();
	  
	  	demo.add("emre");
		demo.add("necip");
		demo.add(1, "yusuf");
		demo.add("alp");
		String str = "The contents of the list";
		System.out.println(str + "\n" + demo);
		
		demo.remove("alp");
		
		System.out.println("\nThe new content of the list: \n"  + demo);
	  
  }
}

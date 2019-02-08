package AlgorithmWorkbench;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 boolean flag;	
     flag = endsWith("emre.com");
     
      System.out.println(flag);
		

	}
	
	public static boolean endsWith(String str)
	{
		boolean status;
		
		if(str.endsWith(".com"))
			status = true;
		else 
			status = false;
		
		return status;
	}

}

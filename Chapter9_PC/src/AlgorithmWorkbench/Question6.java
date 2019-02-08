package AlgorithmWorkbench;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag;	
	     flag = endsWith("emre.COM");
	     
	      System.out.println(flag);
			

		}
		
		public static boolean endsWith(String str)
		{
			boolean status;
			
			str = str.toLowerCase();
			
			if(str.endsWith(".com"))
				status = true;
			else 
				status = false;
			
			return status;
		}

	

}

package AlgorithmWorkbench;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		int count = 0;
		String str = "mali1942";
		
	    for(int i = 0; i < str.length(); i++)
	    {
	    	if(Character.isDigit(str.charAt(i)))
	    		count++;
	    }
	    
	    System.out.println(count);
	    

	}

}

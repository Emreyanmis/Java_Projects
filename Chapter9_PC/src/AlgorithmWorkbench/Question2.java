package AlgorithmWorkbench;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		
		String str = "halis emre yanmis ";
		
		for(int i = 0; i < str.length(); i++)
		{	
			if(Character.isWhitespace(str.charAt(i)))
				count++;
		}
		
		System.out.println(count);
	}

}

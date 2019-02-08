package AlgorithmWorkbench;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int count = 0;
		
		String str = "Halis Emre Yanmis";
		
		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
				count++;
		}
		
		System.out.println(count);
		
	}

}

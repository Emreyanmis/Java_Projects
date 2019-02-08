package AlgorithmWorkbench;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		String name = "cookies>milk>fudge:cake;ice: cream-";
		
		String[] tokens = name.split("[ >:;-]");
		
		for(String s: tokens)
			System.out.println(s);

	}

}

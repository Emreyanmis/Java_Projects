import java.util.ArrayList;

public class ArrayListMethods 
{

	public static void main(String[] args) 
	{
	    ArrayList<Integer> x = new ArrayList<Integer>();	
        x.add(5);
        x.add(21);
        x.add(34);
        x.add(454);
        x.add(12);
        
	    // [5,21,34,454,12]
        // Size: 5
        
        System.out.println( x.get(2)) ; // 34 
        System.out.println( x.size() ); // 5
        
        x.set(2, 64);
        // [2,21,64,454,12]
        System.out.println( x.get(2) ); // 64
        
        x.add(1,82);
        // [2,82,21,64,454,12] 
        System.out.println( x.size() ); // 6
        
        x.remove(2);
        // [5,82,64,454,12]
        System.out.println( x.size() );//5
        
	}

}

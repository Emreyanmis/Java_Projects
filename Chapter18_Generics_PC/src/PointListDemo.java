
public class PointListDemo 
{

	public static void main(String[] args) 
	{
		PointList<Integer> p1 = new PointList<Integer>(1,2);
		PointList<Double> p2 = new PointList<Double>(1.3,2.3);
		PointList<Long> p3 = new PointList<Long>(1l,2l);
		PointList<Float> p4 = new PointList<Float>(1f,2f);
        
		System.out.println("Points in the ArrayList are:");
		System.out.println("X coordinate: " + p1.getX() +"\t\tY coordiate: " +p1.getY());
		System.out.println("X coordinate: " + p2.getX() +"\tY coordiate: " +p2.getY());
		System.out.println("X coordinate: " + p3.getX() +"\t\tY coordiate: " +p3.getY());
		System.out.println("X coordinate: " + p4.getX() +"\tY coordiate: " +p4.getY());
	    
	    
	   

	}

}

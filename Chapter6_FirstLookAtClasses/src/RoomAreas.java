import javax.swing.JOptionPane;

public class RoomAreas
{

	public static void main(String[] args)
	{
		double number;
		double totalArea;
		String input;
		
		// Create three Rectangle objects.
		Rectangle3 kitchen =  new Rectangle3();
		Rectangle3 bedroom =  new Rectangle3();
		Rectangle3 den =  new Rectangle3();
		
		input = JOptionPane.showInputDialog("What is the length of the kitchen in meters? ");
		number = Double.parseDouble(input);
		kitchen .setLength(number);
		
		input = JOptionPane.showInputDialog("What is hte width of the kitchen in meters?");
		number = Double.parseDouble(input);
		kitchen.setWidth(number);
		
		
		input = JOptionPane.showInputDialog("What is the length of the bedroom in meters?");
	    number = Double.parseDouble(input);
	    bedroom.setLength(number);
	    
	    input = JOptionPane.showInputDialog("What is the width of the bedroom in meters?");
	    number = Double.parseDouble(input);
	    bedroom.setWidth(number);
	    
	    
	    input = JOptionPane.showInputDialog("What is the length of the den?");
	    number = Double.parseDouble(input);
	    den.setLength(number);
	    
	    input = JOptionPane.showInputDialog("What is the width of the den?");
	    number = Double.parseDouble(input);
	    den.setWidth(number);
	    
	    totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
	    
	    JOptionPane.showMessageDialog(null, "The total area of the rooms is: " + totalArea + " meters square.");
	     
	    System.exit(0);
	}

}

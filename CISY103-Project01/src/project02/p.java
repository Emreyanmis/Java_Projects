package project02;

//Nihal Dolunay 

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class p 
{
public static void main(String[] args)
{
    String input;
    int parkingSpaces;
    int numberOfLevels;
    double totalCost;
    
    DecimalFormat formatter = new DecimalFormat("000,000.00");

    input=
      JOptionPane.showInputDialog("How many levels of "+
                                  "parking do you want?");
    numberOfLevels = Integer.parseInt(input);

    input=
      JOptionPane.showInputDialog("How many total parking "+
                                  "spaces do you want?");
    parkingSpaces = Integer.parseInt(input);

    if (numberOfLevels == 1)
    {    
    totalCost = parkingSpaces * 1685.43 ;
     
    JOptionPane.showMessageDialog(null, String.format("Estimated cost of"+
                                  "parking lot is $%,.2f", totalCost));
    }
    else
    {
    totalCost = (parkingSpaces*26236.71) + (1000000.00*(numberOfLevels-1));
    
    JOptionPane.showMessageDialog(null, String.format("Estimated cost of"+
                                  "parking deck is $%,.2f", totalCost));
    }
    System.exit(0);
}  

}
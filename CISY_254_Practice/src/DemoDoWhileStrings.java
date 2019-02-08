import java.util.Scanner;

/**
 * This program demonstrates a do while for a menu
 * Date Written:    10/24/2004
 * Date Modified:   10/22/2006 - changed BufferedReader to Scanner
 *                  10/18/2007 - changed to strings
 * @author Stephen Brower
 */
public class DemoDoWhileStrings
{
    /**
     * The main method is the program's starting point.
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        String customerChoice;

        Scanner input = new Scanner(System.in);

        do
        {
            // display menu
            System.out.println("\nIgloo Ice Cream Store");
            System.out.println("\nMenu Choices");
            System.out.println("\n1 - Sundae");
            System.out.println(  "2 - Shake");
            System.out.println(  "3 - Cone");
            System.out.println("\n0 - Exit\n");

            System.out.print("Enter the customer's choice: ");
            customerChoice = input.nextLine();

            if (customerChoice.equalsIgnoreCase("0") ||
                customerChoice.equalsIgnoreCase("Bye") ||
                customerChoice.equalsIgnoreCase("Exit"))
            {
                  System.out.println("\nBye bye!\n");
            }
            else if (customerChoice.equalsIgnoreCase("1") ||
                     customerChoice.equalsIgnoreCase("Sundae"))
            {
                  System.out.println("\nSundaes Use:");
                  System.out.println("\t8 oz. ice cream");
                  System.out.println("\t1 oz. chopped nuts");
                  System.out.println("\t2 oz. chocolate sauce");
                  System.out.println("\t1     cherry");
            }
            else if (customerChoice.equalsIgnoreCase("2") ||
                     customerChoice.equalsIgnoreCase("Shake"))
            {
                  System.out.println("\nShakes Use:");
                  System.out.println("\t10 oz. ice cream");
                  System.out.println("\t1 oz.  chocolate sauce");
            }
            else if (customerChoice.equalsIgnoreCase("3") ||
                     customerChoice.equalsIgnoreCase("cone"))
            {
                  System.out.println("\nCones Use:");
                  System.out.println("\t6 oz. ice cream");
                  System.out.println("\t1     cone");
            }
            else
                  System.out.println("\nyou entered an invalid choice");

        } while ( !(customerChoice.equalsIgnoreCase("0") ||
                customerChoice.equalsIgnoreCase("Bye") ||
                customerChoice.equalsIgnoreCase("Exit")));
    } // end main method
} // end class
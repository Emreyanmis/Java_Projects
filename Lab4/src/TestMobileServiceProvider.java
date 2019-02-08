/**
    Prepared by:    		  Linda Yang
    Originally Programmed by: Stephen Brower
    Date Prepared:            2/11/2015
*/

import java.util.Scanner;

public class TestMobileServiceProvider
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String customersPackageInput;
        char customersPackage;
        int minutesUsed;

        MobileServiceProvider customersMobilePlan;

        System.out.print("Enter Customers Mobile package (A,B,C): ");
        customersPackageInput = input.nextLine();

        // for this lab we assume a letter entered
        customersPackage = customersPackageInput.charAt(0);

        System.out.print("Enter the number of minutes the customer used their phone: ");
        minutesUsed = input.nextInt();

        // instantiate the object
        customersMobilePlan = new MobileServiceProvider(customersPackage,minutesUsed);

        System.out.printf("\nTotal Charges: %,.2f\n",customersMobilePlan.totalCharges());
    }
}

import java.util.Scanner;

public class FactorialDemo
{
    public static void main(String[] args)
    {
      int number;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a nonnegative number: ");
      number = keyboard.nextInt();
      
      System.out.println(number + "! is " + factorial(number));
    }
    
    private static int factorial(int n)
    {
        if(n == 0)
           return 1;
         
        else 
           return n * factorial(n-1);
    }
}

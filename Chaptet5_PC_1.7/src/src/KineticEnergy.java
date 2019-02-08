import java.util.Scanner;

public class KineticEnergy
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double mass, velocity, KE;
		
		System.out.print("Enter the mass in kilograms: ");
		mass = keyboard.nextDouble();
		
		System.out.print("Enter the velocity in meters per second: ");
		velocity = keyboard.nextDouble();
		
		KE = kineticEnergy(mass, velocity);
		
		System.out.println("The kinetic energy of the object is: " + KE);	
	}
	
	public static double kineticEnergy(double m, double v)
	{
	   double KE;
	   
	   KE = (0.5) * (m) * (v * v);
	   
	   return KE;
	}
}

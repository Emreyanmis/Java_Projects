package Question6;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.*;

public class FileArray 
{
	public static void main(String[] args) throws IOException
	{
		
		// Create a Scanner object
		Scanner keyboard = new Scanner(System.in);
		String fileName;
		
		// Holds the numbers array size
		int size;
		
		System.out.print("Enter the new file name: ");
		fileName = keyboard.nextLine();
		
		System.out.print("Enter how many numbers you would like to store: ");
		size = keyboard.nextInt();
		
		// Numbers to locate in the array
		int numbers[] = new int[size];
		
		System.out.println();
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print("Enter the #" + (i +1) + ": ");
			numbers[i] = keyboard.nextInt();
		}
		
		writeArray(fileName, numbers);
		readArray(fileName,numbers);
		
	}

	public static void writeArray(String fileName, int[] numbers) throws IOException 
	{
		
		FileOutputStream fstream = new FileOutputStream(fileName);
	    DataOutputStream outputFile = new DataOutputStream(fstream);
		
	   System.out.println("\nWriting the numbers to the file");
	    
	    for(int i = 0; i < numbers.length; i++)
	    	outputFile.writeInt(numbers[i]);
	    
	   System.out.println("Done");
	   
	   
	   // Close the file
	   outputFile.close();
	    	
	}
	
	public static void readArray(String fileName, int[] numbers) throws IOException 
	{
		// EOF flag
		boolean endOfFile = false;
		
		// A number from the file
		int number;
		
		FileInputStream fstream = new FileInputStream(fileName);
	    DataInputStream inputFile = new DataInputStream(fstream);
		
	    System.out.println("\nReading the numbers to the file");
	    
		while(!endOfFile)
		{
			try
			{
				number =  inputFile.readInt();
				System.out.print(number + " ");
			}
			catch(EOFException e)
			{
				endOfFile = true;
			}
		}
		
		System.out.println("\nDone");
		   
		// Close the file
		inputFile.close();
		
		
	}

}

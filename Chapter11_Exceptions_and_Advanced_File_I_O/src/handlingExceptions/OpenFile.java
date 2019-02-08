package handlingExceptions;

// For File class and FileNotFoundException
import java.io.*; 

// For the Scanner class
import java.util.Scanner;

// For the JOptionPane class
import javax.swing.JOptionPane;

public class OpenFile 
{

	public static void main(String[] args) 
	{
		// For file input
		File file;
		
		// For file input
		Scanner inputFile;
		
		// To hold a file name
		String fileName;
		
		// Get a file name from the user
		fileName = JOptionPane.showInputDialog("Enter the name of the file:");
		
		// Attempt to open the file
		try
		{
			file = new File(fileName);
			inputFile = new Scanner(file);
			JOptionPane.showMessageDialog(null, "The file was found");
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "File was not found.");
		}
		
		JOptionPane.showMessageDialog(null, "Done.");
		System.exit(0);
	}

}

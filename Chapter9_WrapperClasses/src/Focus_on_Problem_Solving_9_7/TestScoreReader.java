package Focus_on_Problem_Solving_9_7;


import java.util.Scanner;
import java.io.*;

public class TestScoreReader 
{
	private Scanner inputFile;
	private String line;
	
	public  TestScoreReader(String fileName) throws IOException
	{
		File file = new File(fileName);
		inputFile = new Scanner(file);
	}
	
	
	public boolean readNextLine() throws IOException
	{
		boolean lineRead;
		
		lineRead = inputFile.hasNextLine();
		
		if(lineRead)
			line = inputFile.nextLine();
		
		return lineRead;
	}
	
	public double getAvearge()
	{
		int total = 0;
		double average;
		
		String[] tokens = line.split(",");
		
		for(String str: tokens)
			total += Integer.parseInt(str);
		
		average = (double) total / tokens.length;
		
		return average;
	}
	
	/**
	 * The close method closes the file.
	 */
	public void close() throws IOException
	{
		inputFile.close();
	}
	
}

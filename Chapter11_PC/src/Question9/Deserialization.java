package Question9;

import java.io.*;
public class Deserialization 
{
    public static void main(String[] args) throws Exception
    {
          final int students = 5;
          double average;
          
          // Create the stream objects.
	      FileInputStream inStream =  new FileInputStream("Question.dat");
	      ObjectInputStream objectInputFile = new ObjectInputStream(inStream);
	      
	      // Create a TestScores array
	      TestScores[] tests = new TestScores[students];
	      
	      // Read the serialized objects from the file.
	      for(int i = 0; i < tests.length; i++)
	      {  
	    	  tests[i] = (TestScores) objectInputFile.readObject();
	      }	  
	      
	      // Close the file.
	      objectInputFile.close();
	      
	      // Display the objects
	      for(int i = 0; i < tests.length; i++)
	    	  System.out.println("Average: " + (i + 1) + tests[i].getAverage());
    	
    }
}

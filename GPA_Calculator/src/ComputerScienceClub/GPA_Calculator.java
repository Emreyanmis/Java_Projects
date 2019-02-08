package ComputerScienceClub;

// Programmed by Halis Emre Yanmis
// Contributed by Nihal Dolunay and Ben Adelson
// Created on 10/25/2018
// College GPA Calculator
// Serves for RV Mobile APP

import java.util.*;
public class GPA_Calculator 
{

	public static void main(String[] args) 
	{
		// Create the Scanner Objects
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboard1 = new Scanner(System.in);
	
		// Gets the number of courses from the user
		int numCourses;
		
		// Gets the letter grade from the user
		char letterGrade;
				
		// Number of credits the user takes
		int credits;
			
		// Initializes the sum of number of credits the user takes
		int creditsSum  = 0;
		
		// Gets the letter grade from the user in the form of String variable
		String letterGrade1;
				
		//Gets the percent grade from the user
		double percentGrade;
				
		// Initializes the  percentGradeSum to 0
		double percentGradeSum = 0.0;
			
		// Gets the user's choice 
		// either letterGrade or percentGrade
		char choice;
		
		// Gets the user's choice 
		// either letterGrade or percentGrade
		String choice1; 
		
		// Calculates the GPA for the percent grade
		double gpaPercentGrade;
		
		// Holds the sum of the grades for percent grade
		double sumGradesPercent = 0.0;
		
		// Flag variable initialized true
		boolean flag = true;
		
		// Holds the final GPA
		double finalGPA = 0.0;
			
		// Ask the user about number of courses the user is taking
	    System.out.print("How many courses are you taking this semester: ");
	    numCourses = keyboard.nextInt();    
	
	    System.out.print("\nUse Percent Grade or Letter Grade "
	    				+ "(p = percent grade , l = letter grade) :");
	    choice1 = keyboard1.nextLine();
	    choice1 = choice1.toLowerCase();
	    choice = choice1.charAt(0);
	    
	    // Calculates the GPA for the letter grade
	    double gpaLetterGrade = 0.0;
	    
	  do
	  {	  
	    if(choice == 'p')	
	    {	
	         for(int i = 0; i < numCourses; i++)
	         {
	        	 do
	        	 {	 
		        	 System.out.print("\nGrade for course #" + (i + 1) + ": ");
		        	 percentGrade = keyboard.nextDouble();
	        	 }while(percentGrade < 0 || percentGrade > 100);
	        	 
	        	 percentGradeSum += percentGrade;
	        	 do 
	        	 {
		        	 System.out.print("Credits for coure #"  + (i + 1) + ": ");
		        	 credits = keyboard.nextInt();
	        	 }while(credits < 0 || credits > 10);
	        	 creditsSum += credits;
	        	 sumGradesPercent += credits * percentGrade;
	         }
	         
	         gpaPercentGrade = sumGradesPercent / creditsSum;
	         
	         if(gpaPercentGrade >= 90)
	        	 	finalGPA = 4.00;
	         else if(gpaPercentGrade >= 87)
	        	 	finalGPA = 3.30;
	         else if(gpaPercentGrade >= 80)
	        	 	finalGPA = 3.00;
	         else if(gpaPercentGrade >= 77)
	        	 	finalGPA = 2.30;
	         else if(gpaPercentGrade >= 70)
	        	 	finalGPA = 2.00;
	         else if(gpaPercentGrade >= 60)
	        	 	finalGPA = 1.00;   	 
	         else
	        	 	finalGPA = 0.00;   	 
	    }   
	    else if(choice == 'l')       	 
	    {
		    	double finalGPA1 = 0.0;
		    	double letterGradeSum = 0.0;
		    	
		    	for(int i = 0; i < numCourses; i++)
		        {
		    		 
		        	 System.out.print("\nLetter Grade for course #" + (i + 1) + ": ");        	 
		        	 letterGrade1 = keyboard1.nextLine();
		        	 letterGrade1 = letterGrade1.toLowerCase();
		    		
		        
		        	 keyboard.nextLine(); 
		        	 System.out.print("Credits for coure #"  + (i + 1) + ": ");
		        	 credits = keyboard.nextInt();
		        	 creditsSum += credits;
		     	 
		        	 if(letterGrade1.startsWith("a"))
		        		 letterGradeSum = 4.00;
		        	 else if(letterGrade1.startsWith("a-"))
		        		 letterGradeSum = 3.70;
		        	 else if(letterGrade1.startsWith("b+"))
		        		 letterGradeSum = 3.30;
		        	 else if(letterGrade1.startsWith("b"))
		        		 letterGradeSum = 3.00;
		        	 else if(letterGrade1.startsWith("c+"))
		        		 letterGradeSum = 2.30;
		        	 else if(letterGrade1.startsWith("c"))
		        		 letterGradeSum = 2.00;
		        	 else if(letterGrade1.startsWith("d"))
		        		 letterGradeSum = 1.00;
		        	 else
		        		 letterGradeSum = 0.00;
		        	
		        	 gpaLetterGrade += (letterGradeSum * credits);
		         }
		    	
		    	finalGPA =  gpaLetterGrade / creditsSum;
	    }
	    else
	    {
	    		System.out.printf("Your entered an invalid choice!\nPlease try again.\n");
	    		System.out.print("\nDo you want to use percent grade or letter grade to calculate your GPA "
    		    				+ "(p = percent grade , l = letter grade ) :");
    		    choice1 = keyboard1.nextLine();
    		    choice1 = choice1.toLowerCase();
    		    choice = choice1.charAt(0);
	    		flag = false;
	    }	
	  }while(flag == false); 
	 
	   System.out.printf("\nYour GPA is: %.2f",finalGPA);
	    
	}

}

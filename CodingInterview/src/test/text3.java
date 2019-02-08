package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class text3 {

	public static void main(String[] args) 
	{
		int digits[] = {9,9};
		System.out.println(Arrays.toString(plusOne(digits)));

	}
	 public static int[] plusOne(int[] digits) 
	 {
		 
		  int n = digits.length;
		    for(int i=n-1; i>=0; i--) {
		    	System.out.println("i: "+  i + ": " + digits[i]);
		        if(digits[i] < 9) {
		        	System.out.println("i: "+  i + ": " + digits[i]);
		            digits[i]++;
		            return digits;
		        }
		        System.out.println("i: "+  i + ": " + digits[i]);
		        
		        digits[i] = 0;
		    }
		    
		    int[] newNumber = new int [n+1];
		    newNumber[0] = 1;
		    
		    return newNumber;
	
    	   		
        
    }

}

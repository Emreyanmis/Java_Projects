package LeetCode_easy;

import java.util.HashSet;
import java.util.Set;

public class Valid_Sudoku {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,5,5,5,9,9,0,0,2,2,1};
		isValidSudoku1(arr);
	}
	 public static boolean isValidSudoku(char[][] board) {
	        Set seen = new HashSet();
	         for (int i=0; i<9; ++i) {
	            for (int j=0; j<9; ++j) {
	                char number = board[i][j];
	                if (number != '.')
	                    if (!seen.add(number + " in row " + i) ||
	                        !seen.add(number + " in column " + j) ||
	                        !seen.add(number + " in block " + i/3 + "-" + j/3))
	                        return false;
	                System.out.println(seen);
	              }
	            }
	       return true;     
	 }
	  public static void isValidSudoku1(int[] arr) {
		  Set seen = new HashSet();
		  Set seen1 = new HashSet();
		  int p;
		  for(int i: arr) {
			  if(i != 5)
				  break;
			  else
				  seen.add(i); 
		  }
		  
		  seen1.add(8);
		  seen1.add(89);
		  seen1.add(89);
		  
		  System.out.print(seen1 + "" );
		  
		  
	  }
	 
	 
}

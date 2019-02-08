package leetCode_interview_easy_collections_arrays;

public class RotateImage {

	public static void main(String[] args) {
		int[][] ar= {{1,2,3},{4,5,6},{7,8,9}};
		rotate(ar);
	}
	public static void rotate(int[][] matrix) {
		int n = matrix.length, temp;
		for(int i = 0; i < (n+1) / 2; i++) {
			for(int j = 0;j < n/2; j++) {
				temp = matrix[n - j - 1 ][i];			
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];              
                matrix[n - i - 1][n - j - 1] = matrix[j][n -i - 1];
                matrix[j][n - i - 1] = matrix[i][j];
                matrix[i][j] = temp;       
			}
		}
	}
}

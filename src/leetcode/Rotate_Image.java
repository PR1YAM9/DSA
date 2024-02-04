package leetcode;

public class Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	Brute Force with Space, (0,0) -> (0,n-1), (1,0) -> (0,2) ==== (i,j) -> (j,n-i-1)
	public void rotateBrute(int[][] matrix) {
		int m = matrix.length;
        int n = matrix[0].length;
        int [][] arr = new int[m][n];
        for(int i =0;i<m ;i++){
            for(int j =0;j<n;j++){
               arr[j][n-i-1] = matrix[i][j];
            }
        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                matrix[i][j]=arr[i][j] ;
            }
        }
	}
	public void rotate(int[][] matrix) {
//		Transpose the matrix: Row becomes column and column becomes row
		int m = matrix.length;
        int n = matrix[0].length;
		for(int i  =0;i<m;i++) {
			for(int j = i+1;j<n;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] =temp;
			}
		}
		for(int i = 0;i<m;i++) {
			int start = 0;
			int end = m-1;
			while(start<end) {
				int temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
				start++;
				end--;
			}
		}
	}
}

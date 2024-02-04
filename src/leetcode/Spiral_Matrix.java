package leetcode;
import java.util.*;
public class Spiral_Matrix {

	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(spiralOrder(arr));

	}
	 public static List<Integer> spiralOrder(int[][] arr) {
		 List<Integer> list = new ArrayList<>();
		 
		 int minC = 0;
		 int minR = 0;
		 int maxC = arr[0].length-1;
		 int maxR = arr.length-1;
		 
		 int total = arr[0].length * arr.length;
		 int count = 0;
		 
		 while(count<total) {
			 for(int i = minC;i<=maxC && count< total;i++) {
				 list.add(arr[minR][i]);
				 count++;
			 }
			 minR++;
			 
			 for(int i = minR;i<=maxR && count< total;i++) {
				 list.add(arr[i][maxC]);
				 count++;
			 }
			 maxC--;
			 
			 for(int i = maxC; i>= minC && count< total ;i--) {
				 list.add(arr[maxR][i]);
				 count++;
			 }
			 maxR--;
			 
			 for(int i = maxR; i>=minR && count< total;i--) {
				 list.add(arr[i][minC]);
				 count++;
			 }
			 minC++;
		 }

		 return list;
	 }
}

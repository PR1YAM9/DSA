package leetcode;

import java.util.Arrays;
import java.util.List;

public class Find_Missing_and_Repeating_Numbers {

	public static void main(String[] args) {
		int[] A= {1, 2, 3, 2};
		findMissingRepeatingNumbers(A);
	}
	public static int[] findMissingRepeatingNumbers(int []a) {
		int arr[] = new int[a.length];
        for(int i = 0;i<a.length;i++){
            arr[a[i]-1] = arr[a[i]-1]+1;
        }
        int missing = -1;
        int repeating = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                missing = i+1;
            }
            if(arr[i]>1){
                repeating = i+1;
            }
        }
        int ans[] = {repeating,missing};
        return ans;
    }
	
}

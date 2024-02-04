package leetcode;

import java.util.Arrays;

public class Divide_Array_Into_Arrays_With_Max_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[][] divideArray(int[] nums, int k) {

        int arr[][] = new int[nums.length/3][3];
        Arrays.sort(nums);
        int j = 0;
        for(int i =2;i<nums.length;i=i+3){
            if(nums[i]-nums[i-2] <=k){
                int ans[] = new int[3];
                ans[0] = nums[i-2];
                ans[1] = nums[i-1];
                ans[2] = nums[i];
                arr[j] = ans;
                j++;
            }else{
                return new int[0][];
            }
        }

        return arr;
    }
}

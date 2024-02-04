package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Maximum_Sum_Subarray {

	public static void main(String[] args) {
		int arr[] = {-1,-2,4,-1,3,2,-9};
		System.out.println(maxSubArray(arr));
	}
//	Optimal
	public static int maxSubArray(int[] nums) {
        int sum =0;
        int max = nums[0];
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            if(sum>max){
            	max = sum;
            }
            if(sum <0){
                sum =0;
            }
        }
        return max;
    }
// Brute Force
	public static int maxSum(int[] nums){
		int max = 0;
		for(int i =0;i<nums.length;i++) {
			int sum =0;
			for(int j = i;j<nums.length;j++) {
				sum += nums[j];
				max = Math.max(max, sum);
			}
		}
		
		return max;
	}
//	Optimal plus print the subarray
	public static int maxSubArrayAndPrint(int[] nums) {
        int sum =0;
        int max = nums[0];
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            list.add(nums[i]);
            if(sum>max){
            	list1 = new ArrayList<>(list);
                max = sum;
            }
            if(sum <0){
            	list.clear();
                sum =0;
            }
        }
        System.out.println(list1);
        return max;
    }
	
}

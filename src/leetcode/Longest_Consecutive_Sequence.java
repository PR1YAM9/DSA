package leetcode;

import java.util.*;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		

	}
	 public static int longestConsecutive(int[] nums) {
		 if(nums.length ==0 || nums == null){
	            return 0;
	        }
	        Set<Integer> set = new HashSet<>();
		        int max = 0;
		        for(int  i =0;i<nums.length;i++){
		        	set.add(nums[i]);
		        }
		        int count = 1;
		        for(int i =0;i<nums.length;i++) {
	                if(!set.contains(nums[i]-1)){
	                    count = 1;

	                    while(set.contains(nums[i]+1)){
	                        count++;
	                        nums[i]++;
	                    }
	                }
	                max = Math.max(count,max);
		        }
		     return max;
	 }
}

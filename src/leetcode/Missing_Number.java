package leetcode;

public class Missing_Number {

	public static void main(String[] args) {
		int[] arr = {3,0,1};
		System.out.println(missingNumber(arr));

	}
	 public static int missingNumber(int[] nums) {
	        int n  = nums.length;
	        int total = n * (n+1)/2;
	        int aSum =0;
	        for(int i =0;i<nums.length;i++){
	            aSum = aSum + nums[i];
	        }
	        return total - aSum;
	    }
}

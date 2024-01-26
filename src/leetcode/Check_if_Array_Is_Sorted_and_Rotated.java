package leetcode;

public class Check_if_Array_Is_Sorted_and_Rotated {

	public static void main(String[] args) {
		int[]  nums = {3,4,5,1,2};
		System.out.println(check(nums));

	}
//	OPTIMAL SOLUTION O(N)
	public static boolean check(int[] nums) {
        int count =0;
        for(int i =1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }
        if(nums[nums.length-1] > nums[0]){
            count++;
        }

        return count<=1;
    }
	
	
	
	
	
//	NOT OPTIMAL
//	public static boolean check(int[] nums) {
//        for(int i =0;i<nums.length;i++){
//            int a = nums[0];
//            for(int j = 0;j<nums.length-1;j++){
//                nums[j] = nums[j+1];
//            }
//            nums[nums.length-1] = a;
//            if(isSorted(nums)){
//                return true;
//            }
//        }
//        return false;
//    }
//    public static boolean isSorted(int[] arr){
//        for(int i =0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                return false;
//            }
//        }
//        return true;
//    }

}

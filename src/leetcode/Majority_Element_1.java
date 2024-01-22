package leetcode;

import java.util.HashMap;

public class Majority_Element_1 {

	public static void main(String[] args) {
		int[] arr= {3,2,3};
		int x = majorityElement(arr);
		System.out.println(x);
	}
	public static int majorityElement(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
                if(map.get(nums[i])> n/2){
                    return nums[i];
                }
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        return -1;
    }

}

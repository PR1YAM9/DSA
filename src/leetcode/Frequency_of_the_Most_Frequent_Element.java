package leetcode;

import java.util.HashMap;

public class Frequency_of_the_Most_Frequent_Element {

	public static void main(String[] args) {
		int[] nums = {1,2,4};
		int k = 5;
		ans(nums, k);

	}
	public static int ans(int[] nums , int k ) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i =0;i<nums.length;i++){
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}else {
				map.put(nums[i], 1);
			}
		}
		for(int i =0;i<nums.length;i++) {
			int num = nums[i];
			for(int j =1; j<=k;j++) {
				num = num + 1;
				if(map.containsKey(num)) {
					map.put(num, map.get(num)+1);
				}
			}
		}
		
		int maxFrequency = 0;
        for (int value : map.values()) {
            maxFrequency = Math.max(maxFrequency, value);
        }
        
        return maxFrequency;

	}

}

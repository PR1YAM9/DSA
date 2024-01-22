package leetcode;

import java.util.HashMap;

public class Sum_of_Subarrays_Equal_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum =0;
        int ans =0;
        map.put(0,1);
        for(int i =0;i<nums.length;i++){
            sum = sum + nums[i];

            if(map.containsKey(sum-k)){
                ans = ans + map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return ans;
    }

}

package leetcode;

import java.util.*;

public class Two_Sum {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int target = 5;
//		twoSum(nums, target);
		pairSum(nums, target);

	}
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[0] = map.get(target-nums[i]);
                ans[1] = i;
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
	public static void pairSum(int[] arr, int s) {
        List<int[]> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(s-arr[i])){
                int a = arr[map.get(s-arr[i])];
                int b = i;
                int ans[] = new int[2];
//                ans[0] = a;
//                ans[1] = b;
//                list.add(ans);
                System.out.print(a+ " "+ arr[i]);
                System.out.println();
            }
            map.put(arr[i],i);
        }
//        return list;
    }
}

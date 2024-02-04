package leetcode;

import java.util.*;

public class Subarray_Sum_ALL {

	public static void main(String[] args) {
		int[] arr = {1,1,1};
		System.out.println(subArray(arr,2));
	}
	public static int subArray(int[] arr,int k) {
		int ans = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		int sum =0;
		map.put(0, 1);
		for(int i =0;i<arr.length;i++) {
			sum += arr[i];
			
			if(map.containsKey(sum-k)) {
				ans = ans + map.get(sum-k);
			}
			
			if(map.containsKey(sum)) {
				map.put(sum, map.get(sum)+1);
			}else {
				map.put(sum, 1);
			}
		}
		return ans;
	}

}

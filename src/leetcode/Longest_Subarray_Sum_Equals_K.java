package leetcode;

import java.util.HashMap;

public class Longest_Subarray_Sum_Equals_K {

	public static void main(String[] args) {
		int[] arr = {1, -1, 5, -2, 3};
		int l = 3;
		System.out.println(ans(arr, l));
	}
	public static int ans(int[] arr, int l) {
		
//		O(N^3) Brute Force
		
		int max =0;
		for(int i =0;i<arr.length;i++) {
			for(int j =i;j<arr.length;j++) {
				int count=0;
				int sum=0;
				for(int k = i;k<j;k++) {
					sum = sum +arr[k];
					if(sum == l) {
						count = k-i+1;
						max = Math.max(max, count);
					}
				}
			}
		}
		return max;
	}
	
	public static int hashAns(int[] arr, int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int sum =0;
		int max =0;
//		map.put(0, 1);
		for(int i =0;i<arr.length;i++) {
			sum += arr[i];
			
			if(sum == k) {
				max = i+1;
			}
			else if(map.containsKey(sum-k)) {
				max = Math.max(max, i-map.get(sum-k));
			}
			if(!map.containsKey(sum)){
				map.put(sum, i);
			}
		}
		return max;
		
	}
}

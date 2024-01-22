package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Sort_the_People {

	public static void main(String[] args) {
		String[] names = {"Mary","John","Emma"};
		int[] heights = {180,165,170};
		
		String[] ans = sortPeople(names, heights);
		List al = Arrays.asList(ans);
		System.out.println(al);

	}
	 public static String[] sortPeople(String[] names, int[] heights) {
		HashMap<Integer,String> map = new HashMap<>();
		for(int i =0;i<names.length;i++) {
			map.put(heights[i], names[i]);
		}
		
		Arrays.sort(heights);
		String[] ans = new String[heights.length];
		int idx = 0;
		
		for(int i = heights.length-1; i>=0;i--) {
			ans[idx] = map.get(heights[i]);
			idx++;
		}
		return ans;
	}

}

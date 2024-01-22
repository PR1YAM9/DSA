package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Majority_Element_2 {

	public static void main(String[] args) {
		int[] nums = {3,2,3};
		List<Integer> ans= majorityElement(nums);
		System.out.println(ans);

	}
	public static List<Integer> majorityElementBadApproach(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length/3;
        System.out.println(n);
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
                if(map.get(nums[i])>n){
                    ans.add(nums[i]);
                }
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        Set<Integer> set = new HashSet<>(ans);
        List<Integer> aList = new ArrayList<Integer>(set);
        return aList;
    }
	
	public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length/3;
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        List<Integer> str = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key)>n){
                str.add(key);
            }
        }
        return str;
    }
}

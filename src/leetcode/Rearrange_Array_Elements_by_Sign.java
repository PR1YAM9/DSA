package leetcode;

public class Rearrange_Array_Elements_by_Sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] rearrangeArray(int[] nums) {
        int [] arr =new int[nums.length];
        int a = 0;
        int b = 1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<0){
                arr[b]=nums[i];
                b = b +2;
            }else{
                arr[a]=nums[i];
                a = a+2;
            }
        }
        return arr;
    }

}

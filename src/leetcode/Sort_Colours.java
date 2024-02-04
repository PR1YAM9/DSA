package leetcode;


public class Sort_Colours {

	public static void main(String[] args) {
		int [] nums = {1,0,2,2,1,1};
		sortColors(nums);
	}

	public static void sortColors1(int[] nums) {
        int zero = 0;
        int one  =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }
        }
        int i = 0;
        while(i<zero) {
        	nums[i++]=0;
        }
        while(i<zero+one) {
        	nums[i++]=1;
        }
        while(i<nums.length) {
        	nums[i++]=2;
        }
    }
	public static void sortColors(int[] nums) {
        int mid = 0;
        int low = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
    }
}

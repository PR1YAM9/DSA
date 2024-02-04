package leetcode;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void ans(int arr[]) {
//		Find break point
		int n = arr.length;
		int idx = -1;
		for(int i = n-2;i>=0;i--) {
			if(arr[i]<arr[i+1]) {
				idx = i;
				break;
			}
		}
		if(idx == -1) {
			reverse(arr,0,arr.length-1);
			return;
		}
		//find next greatest
		for(int i = n-1;i>=idx;i--) {
			if(arr[i]>arr[idx]) {
				swap(arr,i,idx);
				break;
			}
		}
//		rev the array after the break point to make it sorted and get the next permutation
		reverse(arr, idx+1, n-1);
		
	}
	private static void swap(int[] arr, int i, int idx) {
		int temp = arr[i];
		arr[i] = arr[idx];
		arr[idx]= temp;
	}
	private static void reverse(int[] arr, int start, int end) {
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
		
	}
}

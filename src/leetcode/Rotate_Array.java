package leetcode;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void rotate(int[] arr, int k) {
        if(k ==0 || k %arr.length==0){
            return;
        }
        k = k % arr.length;
        rev(arr,0,arr.length-1);
        rev(arr,0,k-1);
        rev(arr,k,arr.length-1);
    }
    public static void rev(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}

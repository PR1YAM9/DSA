package leetcode;

public class Second_Smallest_and_Second_Largest {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(secLargest(arr));
		System.out.println(secSmallest(arr));
		
	}
	public static int secLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>=max){
                ans = max;
                max = arr[i];
            }else if(arr[i] > ans && arr[i]!= max) {
            	ans = arr[i];
            }
        }
        return ans;
    }
    public static int secSmallest(int[] arr){
    	int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

}

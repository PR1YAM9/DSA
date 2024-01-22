package leetcode;

public class Sum_Of_Subarrays_Minimum {

	public static void main(String[] args) {
		int[] arr = {3,1,2,4};
		sumSubarrayMins(arr);
	}
	public static void sumSubarrayMins(int[] arr) {
        int[] prevMin = new int[arr.length];
        int[] nextMin = new int[arr.length];

        for(int i =0;i<arr.length;i++){
            int count =0;
            for(int j =i;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    count++;
                }
                else{
                    prevMin[i] = count;
//                    break;
                }
            }
        }
        print(prevMin);
    }
	
	public static void print(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

}

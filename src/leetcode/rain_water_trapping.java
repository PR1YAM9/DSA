package leetcode;

public class rain_water_trapping {

	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int c = trap(height);
		System.out.println(c);
	}
	public static int trap(int[] height) {
		int[] left = new int[height.length];
        left[0] = height[0];
        int[] right = new int[height.length];
        right[right.length-1] = height[height.length-1];
        for(int i =1;i<height.length;i++){
            left[i] = Math.max(left[i-1],height[i]);
        }
        print(left);
        for(int i =height.length-2;i>=0;i--){
            right[i] = Math.max(right[i+1],height[i]);
        }
        print(right);
        int sum =0;
        for(int i =0;i<height.length;i++){
            sum = sum +  Math.min(left[i],right[i]) - height[i];
        }
        return sum;
	}
	public static void print(int[] arr ) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

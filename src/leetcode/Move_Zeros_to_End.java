package leetcode;

public class Move_Zeros_to_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void moveZeroes(int[] arr) {
        int nz = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[nz] = arr[i];
                nz++;
            }
        }
        for(int i = nz;i<arr.length;i++){
            arr[i] = 0;
        }
    }
}

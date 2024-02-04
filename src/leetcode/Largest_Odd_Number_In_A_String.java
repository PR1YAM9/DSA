package leetcode;

public class Largest_Odd_Number_In_A_String {

	public static void main(String[] args) {
		String num = "527";
		System.out.println(largestOddNumberOP(num));
	}
	 public static String largestOddNumber(String num) {
		 int s  = Integer.parseInt(String.valueOf(num.charAt(num.length()-1)));
	        if(s %2 == 1) {
	            return num;
	        }
	        String ans = "";
	        int i = num.length()-1;
	        while(i>=0){
	            char ch = num.charAt(i);
	            int a = Integer.parseInt(String.valueOf(ch));
	            if(a%2==1){
	                break;
	            }
	            i--;
	        }
	        if(i >=0){
	            ans = num.substring(0,i+1);
	        }
	        return ans;
	 }
	 public static String largestOddNumberOP(String num) {
		 for(int i= num.length()-1;i>=0;i--) {
			 if(num.charAt(i)%2 !=0) {
				 return num.substring(0,i+1);
			 }
		 }
		 return "";
	 }
}

package leetcode;

public class Check_Palindrome {

	public static void main(String[] args) {
		boolean x = isPalindrome(-121);
		System.out.println(x);

	}
	public static boolean isPalindrome(int x) {
        int n =0;
        int ma =x;
        if(x < 0){
            return false;
        }
        while(x!=0){
            int rem = x %10;
            n = n *10 + rem;
            x = x /10;
        }
        if(ma == n){
            return true;
        }
        return false;
    }
}

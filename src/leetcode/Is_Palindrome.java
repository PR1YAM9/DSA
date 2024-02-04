package leetcode;

public class Is_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isPalindrome(String str) {
        if(str == null || str == ""){
            return false;
        }
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i =0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

package leetcode;

public class First_Unique_Character_in_a_String {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
	}
	public static int firstUniqChar(String s) {
        int[] ans = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = ch -'a';
            ans[idx] = ans[idx]+1;
        }
        int a =-1;
        for(int i =0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            if(ans[idx]==1){
                a = i;
                break;
            }
        }
        return a;
    }
}

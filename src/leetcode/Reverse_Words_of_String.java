package leetcode;

public class Reverse_Words_of_String {

	public static void main(String[] args) {
		System.out.println(reverseWords("the sky is blue"));

	}
	public static String reverseWords(String s) {
        String ans = "";
        s = s.trim();
        for(int i = s.length()-1;i>=0;i--){
            String str = "";
            while(i>=0 && s.charAt(i)!=' '){
                str = s.charAt(i)+ str ;
                i--;
            }
            ans = ans + str;
            if(i>0 && ans.charAt(ans.length()-1)!= ' '){
                ans = ans + " ";
            }
        }
        return ans.trim();
    } 
}

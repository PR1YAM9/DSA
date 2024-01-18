package leetcode;

import java.util.Stack;

public class Backspace_string_compare {

	public static void main(String[] args) {
		String str1 = "a#c";
		String str2 =  "b";
		
		System.out.println(backspaceCompare(str1, str2));

	}

	public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(int i =0;i<s.length();i++) {
        	char ch = s.charAt(i);
        	if(ch!= '#') {
        		stack1.push(ch);
        	}else {
        		if(!stack1.isEmpty()) {
        			stack1.pop();
        		}
        	}
        }
        for(int i =0;i<t.length();i++) {
        	char ch = t.charAt(i);
        	if(ch!= '#') {
        		stack2.push(ch);
        	}else {
        		if(!stack2.isEmpty()) {
        			stack2.pop();
        		}
        	}
        }
        while(!stack1.isEmpty()) {
        	str1.append(stack1.pop());
        }
        while(!stack2.isEmpty()) {
        	str2.append(stack2.pop());
        }
        System.out.println(str1);
        System.out.println(str2);
        
        return (str1.toString().equals(str2.toString()));
    }
}

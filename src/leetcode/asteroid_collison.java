package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class asteroid_collison {

	public static void main(String[] args) {
		
		int[] arr = {-2,-1,1,2};
		asteroidCollision(arr);
	}
	public static void asteroidCollision(int[] arr) {
        Stack<Integer> pos = new Stack<>();
        Stack<Integer> neg = new Stack<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                pos.push(arr[i]);
            }else{
                neg.push(-arr[i]);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!pos.isEmpty() && !neg.isEmpty()){
            if(pos.peek() == neg.peek()){
                pos.pop();
                neg.pop();
            }else if(pos.peek() < neg.peek()){
                pos.pop();
            }else{
                neg.pop();
            }
        }
        while(!pos.isEmpty()){
            ans.add(pos.pop());
        }
        Collections.reverse(ans);
        while(!neg.isEmpty()){
            ans.add(neg.pop());
        }
//        Collections.reverse(ans);
        int[] fin = ans.stream().mapToInt(i -> i).toArray();
//        return fin ;
        for(int i =0;i<fin.length;i++) {
			System.out.print(fin[i]+" ");
		}
		System.out.println();
    }

}

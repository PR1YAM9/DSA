package leetcode;

import java.util.*;

public class Superior_Element {

	public static void main(String[] args) {
		int [] a = {1, 2, 2, 1};
		System.out.println(superiorElements(a));

	}
	public static List< Integer > superiorElements(int []a) {
		List<Integer> list = new ArrayList<>();

        int max = 0;
        for(int i = a.length-1;i>=0;i--){
            if(a[i]>max) {
            	max = a[i];
            	list.add(max);
            }
        }        
        Collections.sort(list);
        return list;
    }

}

package leetcode;

import java.util.*;

public class Merge_Two_Sorted_Arrays____Union_Of_Two_Arrays {

	public static void main(String[] args) {
		int[] a= {3 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,9 ,9  };
		int[] b = {2 ,4 ,10,10};
		System.out.println(sortedArray(a, b));
		
	}
//	public static List< Integer > sortedArray1(int []a, int []b) {
//        HashSet<Integer> set = new HashSet<>();
//        for(int i =0;i<a.length;i++){
//            set.add(a[i]);
//        }
//        for(int i=0;i<b.length;i++){
//        	set.add(b[i]);
//        }
//        List<Integer> list = new ArrayList<>(set);
//        Collections.sort(list);
//        return list;
//    }
//	public static List< Integer > sortedArray(int []a, int []b) {
//		List<Integer> list = new ArrayList<>();
//		int i =0;
//		int j =0;
//		HashMap<Integer,Integer> map = new HashMap<>();
//		while(i<a.length && j<b.length) {
//			if(a[i]<=b[j]) {
//				if(!map.containsKey(a[i])) {
//					map.put(a[i], 1);
//					list.add(a[i]);
//				}
//				i++;
//			}else {
//				if(!map.containsKey(b[j])) {
//					map.put(b[j], 1);
//					list.add(b[j]);
//				}
//				j++;
//			}
//		}
//		while(i<a.length) {
//			if(!map.containsKey(a[i])) {
//				map.put(a[i], 1);
//				list.add(a[i]);
//				i++;
//			}
//		}
//		while(j<b.length) {
//			if(!map.containsKey(b[j])) {
//				map.put(b[j], 1);
//				list.add(b[j]);
//				j++;
//			}
//		}
//		return list;
//	}
//	
//}

	public static List< Integer > sortedArray(int []a, int []b) {
		List<Integer> list = new ArrayList<>();
		int i =0;
		int j =0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
					if(list.isEmpty() || list.get(list.size()-1)!= a[i]) {
						list.add(a[i]);
					}
					i++;
			}else if(a[i]>b[j]){
				if(list.isEmpty() || list.get(list.size()-1)!= b[j]) {
					list.add(b[j]);
				}
				j++;
			}
			else {
				if(list.isEmpty() || list.get(list.size()-1)!= a[i]) {
					list.add(a[i]);					
				}
				i++;
				j++;
			}
		}
		while(i<a.length) {
			if(list.isEmpty() || list.get(list.size()-1)!= a[i]) {
				list.add(a[i]);
			}
			i++;
		}
		while(j<b.length) {
			if(list.isEmpty() || list.get(list.size()-1)!= b[j]) {
				list.add(b[j]);
			}
			j++;
		}
		return list;
	
	}
}
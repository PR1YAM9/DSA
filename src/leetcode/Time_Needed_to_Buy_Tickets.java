package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Time_Needed_to_Buy_Tickets {

	public static void main(String[] args) {
		
		int[] tickets = {2,3,2};
		int k = 2;
		System.out.println(timeRequiredToBuy(tickets, k));
	}
	public static int timeRequiredToBuy(int[] arr, int k) {
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i =0;i<arr.length;i++) {
			queue.add(i);
		}
		int count = 0;
		while(!queue.isEmpty()) {
			count++;
			int top = queue.poll();
			if(arr[top]>=1) {
				arr[top] = arr[top]-1;
			}
			if(top == k && arr[top] == 0) {
				break;
			}
			if(top != k && arr[top] == 0) {
				continue;
			}
			queue.add(top);
		}
		return count;
	}
}

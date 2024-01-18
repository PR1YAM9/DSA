package leetcode;

import java.util.Stack;

public class Largest_area_rectangle_histogram {

	public static void main(String[] args) {
		int[] heights = {2,1,5,6,2,3};
//		System.out.println(largestRectangleArea1(heights));
		System.out.println(largestRectangleArea(heights));
		
	}
	public static int largestRectangleArea(int[] arr) {
    int[] prev = new int[arr.length];
    int[] next = new int[arr.length];
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    for (int i = 0; i < arr.length; i++) {
        while (!stack1.isEmpty() && arr[stack1.peek()] > arr[i]) {
            stack1.pop();
        }
        if (!stack1.isEmpty()) {
            prev[i] = stack1.peek();;
        } else {
            prev[i] = -1;
        }
        stack1.push(i);
    }

    for (int i = arr.length - 1; i >= 0; i--) {
        while (!stack2.isEmpty() && arr[stack2.peek()] >= arr[i]) {
            stack2.pop();
        }
        if (!stack2.isEmpty()) {
            next[i] = stack2.peek();
        } else {
            next[i] = arr.length;
        }
        stack2.push(i);
    }

//    print(prev);
//    print(next);

    int maxSum = 0;
    for (int i = 0; i < arr.length; i++) {
        int sum = (next[i] - prev[i] - 1) * arr[i];
        maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
}

public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

}

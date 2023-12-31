package sorting;

public class Basic_Sorting {

	public static void main(String[] args) {
		int arr[] = {7,6,5,4,3,2,1};
//		Selection_sort(arr);
//		Bubble_Sort(arr);
		Insertion_Sort(arr);
	
	}
	public static void Insertion_Sort(int arr[]) {
		for(int i =1;i<arr.length;i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		printArr(arr);
	}
	
	
	public static void Bubble_Sort(int arr[]) {
		for(int i =0;i<arr.length-1;i++) {
			for(int j =0;j<arr.length-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		printArr(arr);
	}	

	public static void Selection_sort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int min =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		printArr(arr);
	}

	private static void printArr(int[] arr) {
		// TODO Auto-generated method stub
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}

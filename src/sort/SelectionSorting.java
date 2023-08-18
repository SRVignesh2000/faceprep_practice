package sort;

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String args[]) {

		int[] arr = { 4, 6, 2, 62, 7 };

//		for(int i=0; i<arr.length; i++) {
//			
//			for(int j=i+1; j<arr.length; j++) {
//				
//				if(arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));

		// method 2
		// getting minimum number

//		for (int i = 0; i < arr.length; i++) {
//			int value = i;
//			int first = arr[i];
//			int min = arr[i];
//
//			for (int j = i + 1; j < arr.length; j++) {
//				if (min > arr[j]) {
//					value = j;
//					min = arr[j];
//				}
//			}
//
//			arr[i] = min;
//			arr[value] = first;
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		

		// method 3
		for (int i = 0; i < arr.length - 1; i++) {
			int small = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[small]) {
					small = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[small];
			arr[small] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}

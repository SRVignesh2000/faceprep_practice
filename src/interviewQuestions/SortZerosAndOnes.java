package interviewQuestions;

import java.util.Arrays;

public class SortZerosAndOnes {

	public static void main(String[] args) {
		
		int[] arr =  { 1,0,0,1,1,0,0,0,1,0,1,1,0,0};
		
		int n = arr.length;
		
//		int start = 0;
//		int end = arr.length-1;
//		
//		while(start < end) {
//			
//			while(arr[end] == 1) {
//				end--;
//			}
//			
//			while(arr[start] == 0) {
//				start++;
//			}
//			
//			if(start < end) {
//				int temp = arr[start];
//				arr[start] = arr[end];
//				arr[end] = temp;
//			}
//
//			System.out.println(Arrays.toString(arr));
//			
//		}
		
		
		// another method
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i] == 0) {
				count++;
			}
		}
		
		for(int i=0; i<n; i++) {
			
			if(i < count) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}
		
		
	}

}

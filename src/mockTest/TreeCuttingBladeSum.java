package mockTest;

import java.util.Arrays;

public class TreeCuttingBladeSum {
	
	public static void main(String[] args) {
		
		int n = 5;
		int cut = 20;
		int[] arr = {26, 4, 40, 46, 42};
		
		Arrays.sort(arr);
		
//		int low = 0;
		int high = arr[n-1];
		int result = 0;
		
//		while(low <= high) {
//			int mid = (low +high)/2;
//			int cutted = 0;
//			
//			for(int i=0; i<n; i++) {
//				if(arr[i] > mid) {
//					cutted += arr[i] - mid;
//				}
//			}
//			
//			if(cutted >= cut) {
//				result = mid;
//				low = mid +1;
//			} else {
//				high =  mid -1 ;
//			}
//			
//		}
//		
//		System.out.println(result);
		
		
		
		// SR method
		while( cut != result) {
			
			for(int i=0; i<n; i++) {
				
				if(arr[i] > high) {
					result += arr[i] - high;
				}
				
			}
			
			if(result < cut) {
				high -=1;
				result = 0;
			}

		}
		
		System.out.println(high);
		
		
	}
	

}

package mockTest;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < n - 1; i++) {
//
//			boolean value = false;
//			
//			for (int j = i + 1; j < n; j++) {
//				if (arr[i] == arr[j] && arr[i] != 0) {
//					value = true;
//					arr[j] = 0;
//				}
//			}
//			if (value) {
//				System.out.print(arr[i] + " ");
//			}
//
//		}
//		
//		sc.close();
		
		
		// another way
		
		int n = 8;
		int[] arr = {1,2,6,2,6,3,8,3};
		
		for(int i=0; i<n; i++) {
			
			int index = arr[i] % n;
			arr[index] = arr[index]+n;
			
			System.out.println(Arrays.toString(arr));
			
		}
		
		
		
		for(int i=0; i<n; i++) {
			if((arr[i]-1) / n >= 2) {
				System.out.println(i);
			}
			
		}

	}
	
	
	
	

}

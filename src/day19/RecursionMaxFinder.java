package day19;

import java.util.Scanner;

public class RecursionMaxFinder {
	
	// easy method
	public static int MaximumValueInArray(int[] arr1, int num, int indexE) {
		
        if (indexE == num) {
            return 0;
        }
        int maxRest = MaximumValueInArray(arr1, num, indexE + 1);
        
        System.out.println(maxRest);
        return Math.max(arr1[indexE], maxRest);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int[] arr = {266,5,6,43,8,4};
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
        
        int index = 0;
        int max = MaximumValueInArray(arr, n, index);
        System.out.print("Maximum element in the array is " + max);
    }

//	public static int max(int[] arr, int n) {
//
//		if (n == 1) {
//			return arr[0];
//		} else {
//			int result = max(arr, n - 1);//5
//			
//			if (result < arr[n - 1]) {
//				return arr[n - 1];
//			} else {
//				return result;
//			}
//		}
//
//	}
//
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int result = max(arr, n);
//		System.out.println("Maximum element in the array is " + result);
//	}
}

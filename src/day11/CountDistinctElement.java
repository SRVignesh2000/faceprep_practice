package day11;

import java.util.Scanner;

public class CountDistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			for (int k = j + 1; k < arr.length; k++) {
				if (arr[j] == arr[k]) {
					count++;
					break;
					// System.out.println(count);
				}
			}
		}
		int result = arr.length - count;
		System.out.println("There are " + result + " distinct element in the array.");
		
		//method 2
//		 Scanner scanner = new Scanner(System.in);
//	        int size = scanner.nextInt();
//	        int[] arr = new int[size];
//	        for (int i = 0; i < size; i++) {
//	            arr[i] = scanner.nextInt();
//	        }
//	        Set<Integer> distinctElements = new HashSet<>();
//	        for (int num : arr) {
//	            distinctElements.add(num);
//	        }
//	        System.out.println("There are " + distinctElements.size() + " distinct element in the array.");

	}

}

package day12;

import java.util.Scanner;

public class PrintDuplicateAndNotDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// Remove duplicates
		int[] distinctArr = new int[n];
		int distinctCount = 0;
		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < distinctCount; j++) {
				if (arr[i] == distinctArr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				distinctArr[distinctCount] = arr[i];
				distinctCount++;
			}
		}
		// Print distinct elements
		for (int i = 0; i < distinctCount; i++) {
			System.out.println(distinctArr[i]);
		}

		// my method
//	    Scanner sc = new Scanner(System.in);
//	    int n = sc.nextInt();
//	    int[] arr = new int[n];
//	    
//	    for(int i=0; i<n; i++) {
//	      arr[i] = sc.nextInt();
//	    }
//	    int find = 0;
//	    
//	    for(int i=0; i<n; i++) {
//	        int count = 0;
//
//	      if(find == arr[i]) {
//	          count++;
//	          continue;
//	      	}
//	      
//	      for(int j=i+1; j<n; j++) {
//	        
//	        if(arr[i] == arr[j]) {
//	          System.out.println(arr[j]);
//	          find = arr[j];
//	          //System.out.println("found");
//	          count++;
//	        }
//	        
//	      }
//	      
//	      if(count == 0) {
//	        System.out.println(arr[i]);
//	      } 
//	      
//	    }

	}

}

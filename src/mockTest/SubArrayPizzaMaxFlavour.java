package mockTest;

import java.util.Scanner;

public class SubArrayPizzaMaxFlavour {

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		int k = scanner.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = scanner.nextInt();
//		}
//		int maxcount = 0;
//		for (int i = 0; i < n; i++) {
//			int count = 0;
//			while (i < n && arr[i] <= k - 1) {
//				count++;
//				i++;
//			}
//			maxcount = Math.max(count, maxcount);
//		}
//		System.out.println(maxcount);
//		scanner.close();
//	}
	
	// n = 5
	// arr = 11121
	// k = 2
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        
        int startIndex = -1;
        int endIndex = -1;
        
        int currentCount = 0;
        int maxcount = 0;
        
        int maxStartIndex = 0;
        int maxEndIndex = 0;
        
        for (int i = 0; i < n; i++) {
        	
            if (arr[i] <= k-1) {
                if (currentCount == 0) {
                    startIndex = i;
                }
                currentCount++;
                endIndex = i;
            } else {
                currentCount = 0;
            }
            
            if (currentCount > maxcount) {
                maxcount = currentCount;
                maxStartIndex = startIndex;
                maxEndIndex = endIndex;
            }
        }
        if (maxcount == 0) {
            System.out.println("There is no continuous subarray");
        } else {
            System.out.println(maxcount);
            // Print the subarray
            for (int i = maxStartIndex; i <= maxEndIndex; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

}

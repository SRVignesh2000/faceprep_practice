package mockTest;

import java.util.Arrays;

public class ProductOfMaximumThreeElements {

	public static void main(String[] args) {
//		int[] arr = { 2, 9, 1, 4, 8, 6, 3, 5 };
		
		// testcase 2
		int[] arr =  {-2,-5,6,2,1}; // -2 * -5  = 10 then 10 * 6 = 60

		Arrays.sort(arr);
		int n = arr.length;

		int maxProduct1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
		int maxProduct2 = arr[0] * arr[1] * arr[n-1];
		
		if(maxProduct1 < maxProduct2) {
			System.out.println("Array Max Product : " + maxProduct2);
		} else {
			System.out.println("Array Max Product : " + maxProduct1);
		}

	}

}

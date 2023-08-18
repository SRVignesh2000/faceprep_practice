package sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 4, 6, 2, 62, 7 };

		for (int i = 0; i < arr.length; i++) {
			boolean swap = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					swap = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (swap) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

		
		
		// method 2
		// do while loop

		boolean swap2;
		do {
			swap2 = false;
			
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swap2 = true;
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		} while (swap2);

		System.out.println(Arrays.toString(arr));

	}

}

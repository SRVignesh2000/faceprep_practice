package mockTest;

public class VisibleMountains {

	// you can either hide the mountain or hide themselves can't do both actions

	public static void main(String[] args) {
		int n = 8;
		int[] arr = { 2, 5, 7, 6, 9, 8, 4, 2 };// 2,2,4,5,6,7,8,9
//		int[] arr = { 1, 1, 1, 1, 2, 2, 4, 5, 6, 9 };

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		// correct method
//		int[] arr = { 1, 1, 1, 1, 2, 2, 4, 5, 6, 9 };
		int count = n;
		int mid = n/2;

		for(int i=0; i<mid; i++) {
			if(arr[mid+i] >= arr[i]*2) {
				count--;
			}
		}
		System.out.println(count);
	}
	
}

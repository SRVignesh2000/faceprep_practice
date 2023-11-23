package mockTest;

public class MaxMinMaxMinPrint {
	
	public static void main(String[] args) {
		
		int n = 5;
		int[] arr = {4,6,2,9,1};
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		
		for(int i=0; i<n/2; i++) {
			System.out.print(arr[i]+" ");
			System.out.print(arr[n-i-1]+" ");
		}
		
		if(n % 2 == 1) {
			System.out.print(arr[n/2]);
		}
		
		
	}

}

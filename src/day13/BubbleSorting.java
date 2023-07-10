package day13;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {98,5,56,12,26};
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			
			for(int j=i; j<n-i-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
					
				}
			}
		}
		
		

	}

}

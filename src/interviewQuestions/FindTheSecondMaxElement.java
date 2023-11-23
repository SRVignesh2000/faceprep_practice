package interviewQuestions;

public class FindTheSecondMaxElement {

	public static void main(String[] args) {
		
		int n = 7;
		int[] arr = {34,652,12,145,3,23,6};
		
		int second;
		
		int largest = second = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			
			largest = Math.max(largest, arr[i]);
			
		}
		
		
		for(int i=0; i<n; i++) {
			
			if(arr[i] != largest) {
				second = Math.max(second, arr[i]);
				
			}
		}
		
		System.out.println(second);
		
		

	}

}

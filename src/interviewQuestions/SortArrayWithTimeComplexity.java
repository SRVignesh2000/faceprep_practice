package interviewQuestions;

import java.util.Arrays;

// for integer
public class SortArrayWithTimeComplexity {

	public static void main(String[] args) {
		
		// array has only 0,1,2s
		
		int n = 7;
		int[] arr = {2,1,0,2,1,0,1};
		
		for(int i =0; i<n-1; i++) {
			
			System.out.println("outside if "+i);
			
			if(arr[i] > arr[i+1]) {
				
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				
				//System.out.println("inside if "+i);
				
				i = -1;
			}
			
			System.out.println(Arrays.toString(arr));
			
		}

	}

}

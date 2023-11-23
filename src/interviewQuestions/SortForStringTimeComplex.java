package interviewQuestions;

import java.util.Arrays;

public class SortForStringTimeComplex {

	public static void main(String[] args) {

		String geeks = "GEEKSFORGEEKS";
		
		char arr[] = geeks.toCharArray();
		
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			
			int d1 = arr[i];
			int d2 = arr[i+1];
			
			if(d1 > d2) {
				
				char temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				
				i = -1;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}

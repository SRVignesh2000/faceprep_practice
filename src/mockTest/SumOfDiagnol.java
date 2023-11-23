package mockTest;

import java.util.Scanner;

public class SumOfDiagnol {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int left = 0;
		int right = 0;
		
		for(int i=0; i< n; i++) {
			
			left += arr[i][i];
			right += arr[i][n-1-i];
			
		}
		
		System.out.println(left+right);
		
		sc.close();
	}

}

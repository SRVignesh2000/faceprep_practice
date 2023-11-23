package mockTest;

import java.util.Scanner;

public class FindNumInMatrixTimeComplex {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] arr = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int value = sc.nextInt();
		
		int row = -1;
		
		for(int i=0; i<m; i++){
			
	           if (value >= arr[i][0] && value <= arr[i][m - 1]) {
	              row = i;
	              break;
	          }
	      }
		
		if(row > -1) {
			
			for(int i=0; i<n; i++) {
				
				if(arr[row][i] == value) {
					System.out.println("Found");
					return;
				}
			}

		} else {
			
			System.out.println("Not Found");
			
//			for(int i=0; i<n; i++) {
//				if(arr[m-1][i] == value) {
//					System.out.println("Not Found");
//					return;  
//				}
//			}
			
		}
		
	}
	
	

}

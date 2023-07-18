package day14;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][n];
        int arr2[][] = new int[m][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
      
      	for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
      
     
		for(int i=0; i<n; i++) {
          for(int j=0; j<m; j++) { 
            int sum = 0;
            for(int k=0; k<m; k++) {
            	sum += arr[i][k]*arr2[k][j];
            }
            System.out.print(sum+" ");
          }
          System.out.println();
        }

	}

}

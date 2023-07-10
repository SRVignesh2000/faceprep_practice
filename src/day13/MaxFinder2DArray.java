package day13;

import java.util.Scanner;

public class MaxFinder2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		int arr[][] = new int[row][column];
      	int max = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = sc.nextInt();
              if(max < arr[i][j]) {
              	max = arr[i][j];
              }
			}
		}
      
      System.out.println(max);

	}

}

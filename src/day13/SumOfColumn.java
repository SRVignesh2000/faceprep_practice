package day13;

import java.util.Scanner;

public class SumOfColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		int arr1[][] = new int[row][column];
		int arr2[][] = new int[row][column];


		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
      
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
      
		for (int i = 0; i < row; i++) {
          int sum = 0;
			for (int j = 0; j < column; j++) {
				sum = arr1[i][j] + arr2[i][j];
              System.out.print(sum+" ");
              
			}
          System.out.println();
		}

	}

}

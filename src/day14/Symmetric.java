package day14;

import java.util.Scanner;

public class Symmetric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] arr = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		if (x == y) {
			int[][] arr1 = new int[x][y];
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					arr1[j][i] = arr[i][j];
				}
			}
			boolean value = true;
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					if (arr[i][j] != arr1[i][j]) {
						value = false;
						break;
					}
				}
			}
			if (!value) {
				System.out.println("Not Symmetric");
			} else {
				System.out.println("Symmetric");
			}
		} else {
			System.out.println("Symmetric");
		}
		
		// method 2
//		Scanner sc = new Scanner(System.in);
//		int row = sc.nextInt();
//		int column = sc.nextInt();
//      
//      if(row != column) {
//        System.out.println("Not Symmetric");
//      	return;
//      } else {
//        
//        int arr[][] = new int[row][column];
//
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < column; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//      
//      
//      int rowSum = 0;
//      int columnSum = 0;
//      for (int i = 0; i < row; i++) {
//			rowSum += arr[0][i];
//		}
//      for (int i = 0; i < row; i++) {
//			columnSum += arr[i][0];
//		}
//      if(rowSum == columnSum) {
//      	System.out.println("Symmetric");
//      } else {
//      	System.out.println("Not Symmetric");
//      }
//      
//      }

	}

}

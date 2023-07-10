package day13;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		int arr[][] = new int[row][column];
      	int sum = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				sum += arr[i][j] = sc.nextInt();
			}
			
		}
      System.out.println(" The sum of the elements in the matrix is "+sum);

	}

}

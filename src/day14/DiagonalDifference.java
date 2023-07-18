package day14;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int arr[][] = new int[row][row];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
      
      	int rowSum = 0;
      	int columnSum = 0;
      	for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
              	if(i == j) {
                  rowSum += arr[i][j];
                  //System.out.println("row" + rowSum);
                }
              	if(j == row - i -1) {
                  columnSum += arr[i][j];
                  //System.out.println(columnSum);
                }
              	
			}
		}
      	System.out.println(Math.abs(rowSum - columnSum));

	}

}

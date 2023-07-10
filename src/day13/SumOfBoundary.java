package day13;

import java.util.Scanner;

public class SumOfBoundary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		int arr[][] = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
      
      	int sum = 0;
      	int mid = row-1;
      	for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if(i == 0 || i == mid || j == 0 || j == mid) {
                	sum += arr[i][j];
                } else {
                  continue;
                }
			}
		}
      	System.out.println("Sum of boundaries is "+sum);

	}

}

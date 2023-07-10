package day13;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		int arr[][] = new int[row][column];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				arr[i][j] = sc.nextInt();
			}
		} 
		
		System.out.println(arr.toString());

	}

}

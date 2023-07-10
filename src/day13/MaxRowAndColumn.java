package day13;

import java.util.Scanner;

public class MaxRowAndColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//row
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		int arr[][] = new int[row][column];
      
        System.out.print("Sum of rows is ");
      	int maxRow = 0;
      	int findRow = 0;
		for (int i = 0; i < row; i++) {
          	int sumRow = 0;
			for (int j = 0; j < column; j++) {
				arr[i][j] = sc.nextInt();
              	sumRow += arr[i][j];
			}

          	if(maxRow < sumRow) {
              maxRow = sumRow;
              findRow = i+1;
            }
          	System.out.print(sumRow+ " ");
		}
      	System.out.println();
      	System.out.print("Row " +findRow+" has maximum sum");
      	System.out.println();
      	
      	
      	//column
      	System.out.print("Sum of columns is ");
      	int maxColumn = 0;
      	int findColumn = 0;
      
		for (int i = 0; i < column; i++) {
          	int sumColumn = 0;
			for (int j = 0; j < row; j++) {
				//arr[j][i] = sc.nextInt();
              	sumColumn += arr[j][i];
			}
          	//rowArr[i] = sumRow;
          	if(maxColumn < sumColumn) {
              maxColumn = sumColumn;
              findColumn = i+1;
            }
          	System.out.print(sumColumn+ " ");
		}
      	System.out.println();
      	System.out.print("Column " +findColumn+" has maximum sum");

	}

}

package day14;

import java.util.Scanner;

public class LowerTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int arr[][] = new int[row][row];
      	boolean isLower = true;
      
      for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = row-1; j >= 0; j--) {
              	if(i == j) {
                	break;
                } else {
                  	if(arr[i][j] != 0) {
                    	isLower = false;
                    }
                }
			}
		}
      
      	if(isLower) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }

	}

}

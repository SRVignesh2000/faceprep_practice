package day14;

import java.util.Scanner;

public class UpperTriangle {

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
      
      boolean isUpper = true;
      
      for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if(i == j) {
                  break;
                } else if (arr[i][j] != 0) {
                  	isUpper = false;
                }
			}
		}
      
      if(isUpper) {
        System.out.println("Yes");
      } else {
      	System.out.println("No");
      }

	}

}

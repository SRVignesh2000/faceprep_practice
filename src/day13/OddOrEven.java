package day13;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int arr[][] = new int[row][row];
      	int max = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				arr[i][j] = sc.nextInt();
              	if(arr[i][j] %2 ==0) {
                  max++;
                }
			}
		}
      if(max == 0 || max == row*row) {
      	System.out.println("Yes");
      } else {
      	System.out.println("No");
      }

	}

}

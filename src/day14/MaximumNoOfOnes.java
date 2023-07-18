package day14;

import java.util.Scanner;

public class MaximumNoOfOnes {

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
      	int max = 0;
      	int find = 0;
      	for (int i = 0; i < row; i++) {
          	int count = 0;
			for (int j = 0; j < column; j++) {
				if(arr[i][j] == 1) {
                	count++;
                }
              	if(max < count) {
                	max = count;
                  	find = i;
                }
			}
          	//System.out.println(i+1+"st row contains - "+count+" 1's");
		}
      	System.out.println(find);

	}

}

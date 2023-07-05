package day10;

import java.util.Scanner;

public class Pattern05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int num = 1;
			for (int i = 0; i < n; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println();
	        }

	}

}

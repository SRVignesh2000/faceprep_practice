package day10;

import java.util.Scanner;

public class Pattern06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// fill your code
	      Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
	      int multi = n*2-1;
	      
	      for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= i*2-1; j++) {
				System.out.print(j + " ");
					
			}
		    System.out.println();
		}

	}

}

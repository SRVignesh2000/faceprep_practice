package day10;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pattern
//		p     n
//		 a   r 
//		  t e  
//		   t   
//		  t e  
//		 a   r 
//		p     n
		
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int n = name.length();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(name.charAt(i));
				} else if (i == n - j - 1) {
					System.out.print(name.charAt(n - i - 1));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

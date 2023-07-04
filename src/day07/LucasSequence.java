package day07;

import java.util.Scanner;

public class LucasSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	     if (n <= 0) {
			System.out.println("Invalid input");
			return;
	     }
	    
	    int a = 0;
	    int b = 0;
	    int c = 1;
	    
	    System.out.print(a + " " + b + " " + c);
	    
	 	for (int i = 4; i <= n; i++) {
	            int nextTerm = a + b + c;
	            System.out.print(" " + nextTerm);

	            // Update the values of a, b, c for the next iteration
	            a = b;
	            b = c;
	            c = nextTerm;
	        }

	        System.out.println();

	}

}

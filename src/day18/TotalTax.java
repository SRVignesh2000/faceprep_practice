package day18;

import java.util.Scanner;

public class TotalTax {

	public static void main(String[] args) {
		
		//input
		// n = 5;
		// arr = {1000, 2000, 3000, 4000, 5000}
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0; i<n; i++) {
	      arr[i] = sc.nextInt();
	    }

	    int totalTax =  0;
			for (int i = 1; i <=n; i++) {
			  int total = arr[i-1];
	          int tax = 0;
	          if(total > 1000) {
	            tax = (total-1000)/10;
	          }
	          totalTax += tax;
				
			}
			System.out.println(totalTax);

	}

}

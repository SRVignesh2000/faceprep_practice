
package day09;

import java.util.Scanner;

public class SeriesIX {
	
	private void psvm() {
		// TODO Auto-generated method stub

	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      int start = 2;
	      for(int i=1; i<=num; i++) {
	        System.out.print(start + " ");
		        int square = i * 13;
		        start += square;
	      }
	}

}

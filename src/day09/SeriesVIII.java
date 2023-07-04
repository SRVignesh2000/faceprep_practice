package day09;

import java.util.Scanner;

public class SeriesVIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      
	      int num = sc.nextInt();
	      int start = 4;
	      
	      for(int i=1; i<=num; i++) {
	        System.out.print(start + " ");
	        int square = i * i;
	        start += square;
	      }

	}

}

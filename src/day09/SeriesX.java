package day09;

import java.util.Scanner;

public class SeriesX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      int start = 2;
	      for(int i=1; i<=num; i++){
	        System.out.print(start+" ");
	        int square = start * start;
	        start = square - 1;
	        
	      }

	}

}

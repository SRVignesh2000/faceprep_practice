package day09;

import java.util.Scanner;

public class SeriesXIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      int start = 2;
	      for(int i=1; i<=num; i++) {
	        System.out.print(start+" ");
	        start = start * 2 + 1;
	      }

	}

}

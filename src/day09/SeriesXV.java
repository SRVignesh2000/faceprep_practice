package day09;

import java.util.Scanner;

public class SeriesXV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      int a = 3;
	      int b = 8;
	      System.out.print(a+" "+b+" ");
	      for(int i=2; i<num; i++) {
	      	int c = a + b + i;
	        System.out.print(c+" ");
	        a = b;
	        b = c;
	      }

	}

}

package day09;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      for (int i=1; i<=num; i++) {
	        int square = i * i;
	        System.out.print(square + " ");
	      }

	}

}

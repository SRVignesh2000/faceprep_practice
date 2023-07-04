package day09;

import java.util.Scanner;

public class SeriesIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc =new Scanner(System.in);
	      int num = sc.nextInt();
	      int n = 3;
	      for(int i=1; i<=num; i++) {
	        System.out.print(n + " ");
	        n *=3 ;
	      }

	}

}

package day05;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int L1x = sc.nextInt();
	      int L2y = sc.nextInt();
	      int L3z = sc.nextInt();
	      
	      if(L1x < L2y && L1x < L2y) {
	        System.out.println("L1");
	      } else if(L2y < L3z) {
	        System.out.println("L2");
	      } else {
	        System.out.println("L3");
	      }

	}

}

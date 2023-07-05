package day10;

import java.util.Scanner;

public class Pattern01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input 7
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      int n = num * 2 - 1;
	      
	      for(int i=num; i>=1; i--) {
	        for (int j=1; j<=i*2-1; j++) {
	          
	          System.out.print(j+" ");
	        }
	        System.out.println();
	      }

	}

}

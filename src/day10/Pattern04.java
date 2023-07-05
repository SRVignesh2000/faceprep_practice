package day10;

import java.util.Scanner;

public class Pattern04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      
	      for(int i = num; i>=1; i--) {
	        
	        for(int k=i; k<=num; k++) {
	          System.out.print(k);
	        }
	        
	        for(int j = 1; j<i; j++) {
	          System.out.print(num);
	        }
	        
	        System.out.println();
	      }

	}

}

package day10;

import java.util.Scanner;

public class Pattern03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      int loopCount = num * 2 -1;
	      for(int i=1; i<=loopCount; i+=2) {
	        
	        for(int j=i; j<=loopCount; j++) {
	          
	          if(j % 2 != 0) {
	            System.out.print(j+" ");
	          } 
	          
	        }
	        System.out.println();
	      }

	}

}

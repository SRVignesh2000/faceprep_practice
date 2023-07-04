package day09;

import java.util.Scanner;

public class SeriesVI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      int result = 0;
	      for(int i=1; i<=num; i++) {
	        
	        if(i % 2 == 0) {
	          result = i * i -2;
	        } else {
	          result = i * i -1;
	        }
	        System.out.print(result +" ");
	      }

	}

}

package day09;

import java.util.Scanner;

public class SeriesV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      int start = 121;
	      int seco = 0;
	      for(int i=0; i<num; i++) {
	        System.out.print(start +" " );
			int multi = i * 32 + 104;
	        start += multi;
	        
	      }

	}

}

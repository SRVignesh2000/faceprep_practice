package day09;

import java.util.Scanner;

public class SeriesXI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc  = new Scanner(System.in);
	      int num = sc.nextInt();
	      float start = 95.0f;
	      float cons = 20.5f;
	      for(int i=0; i<num; i++) {
	        System.out.print(start+" ");
	        float multi = (i * 2) + cons;
	        start += multi;
	      }

	}

}

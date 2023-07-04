package day09;

import java.util.Scanner;

public class SeriesIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      float start = 0.5f;
	      for(int i=1; i<=num; i++){
	        System.out.print(start +" ");
	        start *= 3;
	      }

	}

}

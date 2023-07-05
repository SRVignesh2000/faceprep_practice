package day09;

import java.util.Scanner;

public class SeriesXIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc= new Scanner(System.in);
	      int n=sc.nextInt();
	      int mul=5;
	      for (int i=1;i<=n*2;i++){
	      System.out.print(mul+" ");
	        mul = mul + 11 * i++;
	      }

	}

}

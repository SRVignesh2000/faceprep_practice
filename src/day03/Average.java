package day03;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Scanner sc = new Scanner(System.in);
	      float num1= sc.nextInt();
	      float num2= sc.nextInt();
	      float num3= sc.nextInt();
	      float num4= sc.nextInt();
	      float num5= sc.nextInt();
	      
	      float average = (num1+num2+num3+num4+num5)/5;
	      System.out.printf("%.2f",average);
	}

}

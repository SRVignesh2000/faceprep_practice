package day07;

import java.util.Scanner;

public class MatniShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner (System.in);
	      int age = sc.nextInt();
	      float timing = sc.nextFloat();
	      
	      double adultPrice = 8.00d;
	      double adultMatPrice = 5.00d;
	      double childPrice = 4.00d;
	      double childMatPrice = 2.00d;
	      
	      double price = 0.00;
	      
	      if(age>13) {
	        if(timing == 13.30f){
	          price = adultMatPrice;
	        } else {
	          price = adultPrice;
	        }
	      } else {
	        if(timing == 13.30f){
	          price = childMatPrice;
	        } else {
	          price = childPrice;
	        }
	      }
	      
	      System.out.printf("$%.2f", price);

	}

}

package day07;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int rate = sc.nextInt();
	    int month = sc.nextInt();
	    
	    switch (month) {
	      case 1:
	      	double discount1 = rate * (20/100.00);
	        double price1 = rate - discount1;
	        System.out.printf("Chris father needs to pay Rs.%.2f.%n" , price1 );
	        break;
	      case 2:
	        System.out.printf("Chris father needs to pay Rs.%.2f.%n" ,(double) rate );
	      case 3:
	      case 4:
	        double discount2 = rate * (10/100.00);
	        double price2 = rate - discount2;
	        System.out.printf("Chris father needs to pay Rs.%.2f.%n" , price2 );
	        break;
	      case 5:
	        System.out.printf("Chris father needs to pay Rs.%.2f.%n" ,(double) rate );
	        break;
	      case 6:
	      case 7:
	        double discount3 = rate * (75/100.00);
	        double price3 = rate - discount3;
	        System.out.printf("Chris father needs to pay Rs.%.2f.%n" , price3 );
	        break;
	      case 8:
	      case 9:
	        System.out.printf("Chris father needs to pay Rs.%.2f.%n" ,(double) rate );
	        break;
	      case 10:
	      case 11:
	        double discount4 = rate * (30/100.00);
	        double price4 = rate - discount4;
	        System.out.printf("Chris father needs to pay Rs.%.2f.%n" , price4 );
	        break;
	      case 12:
	        double discount5 = rate * (35/100.00);
	        double price5 = rate - discount5;
	        System.out.printf("Chris father needs to pay Rs.%.2f.%n" , price5 + ".");
	        break;
	      default:
	        System.out.println("Invalid Month");
	      
	      
	    }

	}

}

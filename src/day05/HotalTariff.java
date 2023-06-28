package day05;

import java.util.Scanner;

public class HotalTariff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int month = sc.nextInt();
	      float roomRent = sc.nextFloat();
	      int days = sc.nextInt();
	      
	      switch (month) {
	        case 4:
	        case 5:
	        case 6:
	        case 11:
	        case 12:
	          double rent = (roomRent * 0.2)+roomRent;
	          double totalRent1 = rent * days;
	          System.out.printf("%.2f",totalRent1);
	          break;
	        case 1:
	        case 2:
	        case 3:
	        case 7:
	        case 8:
	        case 9:
	        case 10:
	          double totalRent2 = roomRent * days;
	          System.out.printf("%.2f",totalRent2);
	          break;
	        default :
	          System.out.println("Invalid Input");
	       
	      }

	}

}

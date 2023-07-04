package day07;

import java.util.Scanner;

public class OnlineShopping {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	    Scanner sc = new Scanner(System.in);
	    
	    int priceF = sc.nextInt();
	    int discountF = sc.nextInt();
	    int shippingF = sc.nextInt();
	    
	    int priceS = sc.nextInt();
	    int discountS = sc.nextInt();
	    int shippingS = sc.nextInt();
	    
	    int priceA = sc.nextInt();
	    int discountA = sc.nextInt();
	    int shippingA = sc.nextInt();
	    
	    double discountPriceF = priceF * (discountF/100.00);
	    double totalPriceF = (priceF - discountPriceF ) + shippingF;
	    System.out.println("In Flipkart: Rs." + (int) totalPriceF);
	    
	    double discountPriceS = priceS * (discountS/100.00);
	    double totalPriceS = (priceS - discountPriceS) + shippingS;
	    System.out.println("In Snapdeal: Rs." + (int)totalPriceS);

	    double discountPriceA = priceA * (discountA/100.00);
	    double totalPriceA = (priceA - discountPriceA ) + shippingA;
	    System.out.println("In Amazon: Rs." + (int)totalPriceA);
	    
	    if(totalPriceF < totalPriceS && totalPriceF < totalPriceA) {
	    System.out.println("He will prefer Flipkart");
	    } else if(totalPriceS < totalPriceA) {
	      System.out.println("He will prefer Snapdeal");
	    } else {
	      System.out.println("He will prefer Amazon");
	    }
	}

}

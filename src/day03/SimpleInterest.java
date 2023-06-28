package day03;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// p = 100
		// n = 1
		// r = 10
		
	    Scanner sc = new Scanner(System.in);
	    int p = sc.nextInt();
	    int n = sc.nextInt();
	    int r = sc.nextInt();
	    
	    float si = (p*n*r)/100;
	    double discount = si*(2.0/100);
	    double balanceSI = si-discount;
	    
	    double total = balanceSI + p;
	    
	    System.out.printf("%.2f\n",si);
	    System.out.printf("%.2f\n",p+si);
	    System.out.printf("%.2f\n",discount);
	    System.out.printf("%.2f\n",total);

	}

}

package day06;

import java.util.Scanner;

public class Budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int blast = sc.nextInt();
	      int visual = sc.nextInt();
	      int auditory = sc.nextInt();
	      int arms = sc.nextInt();
	      int leg = sc.nextInt();
	      
	      double costBlast = 350.34;
	      double costvisual = 230.90;
	      double costAuditory = 190.55;
	      double costArms = 125.30;
	      double costLegs = 180.90;
	      
	      double priceBlast = blast * costBlast;
	      double priceVisual = visual * costvisual;
	      double priceAuditory = auditory * costAuditory;
	      double priceArms = arms * costArms;
	      double priceLegs = leg * costLegs;
	      
	      double sum = priceBlast + priceVisual + priceAuditory + priceArms + priceLegs;
	      //System.out.println(sum);
	      if(sum <= 15000.00) {
	        System.out.println("Yes");
	      } else {
	        System.out.println("No");
	      }

	}

}

package day04;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    
	    if(num<=200) {
	      double ans = num*0.5;
	      System.out.println("Rs." +(int) ans );
	    } else if (num>200 && num<=400) {
	      double ans = num*0.65 + 100;
	      System.out.println("Rs." + (int) ans);
	    } else if (num>400 && num<=600) {
	      double ans = num*0.80 + 200;
	      System.out.println("Rs." +(int) ans);
	    } else if (num>600) {
	      double ans = num*1.25 + 425;
	      System.out.println("Rs." +(int)ans );
	    }

	}

}

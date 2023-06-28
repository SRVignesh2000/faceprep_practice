package day03;

import java.util.Scanner;

public class WindchillFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int tow = sc.nextInt();
	    int wv = sc.nextInt();
	    
	    double s = Math.pow(wv, 0.16);
	    
	    double wcf = 35.74 + (0.6215*tow) + ((0.4275*tow - 35.75) * s);
	    System.out.printf("%.2f",wcf);

	}

}

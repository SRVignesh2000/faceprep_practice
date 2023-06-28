package day03;

import java.util.Scanner;

public class Share {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    int goldCoins = sc.nextInt();
	    int benShare = sc.nextInt();
	    int blackShare = sc.nextInt();
	    
	    int firstShare = goldCoins * benShare / 100;
	    int firstBalance = goldCoins - firstShare;
	    
	    int secondShare = firstBalance * blackShare/100;
	    int secondBalance =  firstBalance - secondShare;
	    
	    System.out.println(firstShare);
	    System.out.println(secondShare);
	    System.out.println(secondBalance/3);

	}

}

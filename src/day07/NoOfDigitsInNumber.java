package day07;

import java.util.Scanner;

public class NoOfDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    String numStr = num+"";
	    char[] letters = numStr.toCharArray();
	    int length = letters.length;
	    System.out.println(length);

	}

}

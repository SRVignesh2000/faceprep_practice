package day03;

import java.util.Scanner;

public class FirstAndLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    
	    int num = sc.nextInt();
	    int firstDigit = num/1000;
	    int lastDigit = num%10;
	    int total = firstDigit + lastDigit;
	    
	    System.out.print(total);

	}

}

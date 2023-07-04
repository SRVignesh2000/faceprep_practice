package day07;

import java.util.Scanner;

public class KaprekarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    
	    int number = sc.nextInt();
	    int square = number * number;
	    String squareString = String.valueOf(square);
	    
	    int length = String.valueOf(number).length();
	    int squareLength = squareString.length();
	    
	    int firstNum =Integer.parseInt(squareString.substring(0,squareLength - length));
	    int lastNum =Integer.parseInt(squareString.substring(squareLength - length));
	    int total = firstNum + lastNum;
	    
		if (squareLength > 1 && total == number) {
			System.out.println("Kaprekar Number");
		} else {
			System.out.println("Not A Kaprekar Number");
		}

	}

}

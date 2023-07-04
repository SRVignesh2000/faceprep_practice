package day07;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersAndStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Hello123";
		String[] format = name.toLowerCase().split("");
		
		int letterCount = 0;
		int digitCount = 0;

		String[] alphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		String[] num = { "1", "2", "3", "4", "5","6", "7", "8", "9", "0" };
		
		
		for(int i=0; i<alphabets.length; i++) {
			for(int j =0; j<format.length; j++) {
				if(alphabets[i].equals(format[j])) {
					letterCount++;
				}
			}
			 
		}
		for(int i=0; i<num.length; i++) {
			for(int j =0; j<format.length; j++) {
				if(num[i].equals(format[j])) {
					digitCount++;
				}
			}
			
		}
		
		System.out.println("The number of digits is: \n" + digitCount);
		System.out.println("The number of characters is: \n" + letterCount);

		
		
		
		// method 2
//		String inputString = "Hello123";

	    
//	    int letterCount = 0;
//	    int digitCount = 0;
//
//		for (char ch : inputString.toCharArray()) {
//			if (Character.isDigit(ch)) {
//				digitCount++;
//			} else if (Character.isLetter(ch)) {
//				letterCount++;
//			}
//		}
//
//		System.out.println("The number of digits is: \n" + digitCount);
//		System.out.println("The number of characters is: \n" + letterCount);

	}

}

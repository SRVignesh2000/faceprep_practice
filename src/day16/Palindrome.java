package day16;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String cleanedWord = word.replaceAll(" ", "").toLowerCase();
	    String reversedWord = "";

	    for (int i = cleanedWord.length() - 1; i >= 0; i--) {
	      reversedWord += cleanedWord.charAt(i);
	    }

	    if (cleanedWord.equals(reversedWord)) {
	      System.out.println("Palindrome");
	    } else {
	      System.out.println("Not a palindrome");
	    }

	}

}

package day05;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    char character = sc.next().toLowerCase().charAt(0);
		    if (Character.isLetter(character)) {
		      if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
		        System.out.println("Vowel");
		      } else {
		        System.out.println("Consonant");
		      }
		    } else {
		      System.out.println("Not an alphabet");
		    }
		  }

//	    char letter = sc.next().charAt(0);
	    
//	    switch (letter) {
//	      case 'a':
//	      case 'e':
//	      case 'i':
//	      case 'o':
//	      case 'u':
//	      	System.out.println("Vowel");
//	      	break;
//	      case 1:
//	      case 2:
//	      case 3:
//	      case 4:
//	      case 5:
//	      case 6:
//	      case 7:
//	      case 8:
//	      case 9:
//	      case 0:
//	      	System.out.println("Not an alphabet");
//	      	break;
//	      default :
//	      	System.out.println("Consonant");
//	    }
	    
	    // method 2
//		String alpha = sc.nextLine();
//
//		String vowels = "aeiou";
//	    String nums = "1234567890";
//	    
//	    if(vowels.contains(alpha)) {
//	    	System.out.println("Vowel");
//	    } else if(vowels.contains(nums)) {
//	    	System.out.println("Not an alphabet");
//	    } else {
//	    	System.out.println("Consonant");
//	    }
	    
	    
	// method 3
//	    if(letter == 'a'|| letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
//	    	System.out.println("Vowel");
//	    } else if (letter)
//
//	}

	private static void Switch(char letter) {
		// TODO Auto-generated method stub
		
	}

}

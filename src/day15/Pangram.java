package day15;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      String name = sc.nextLine();
	      String lowerName = name.toLowerCase();
	      char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	      
	      int count = 0;
	      for(int i=0; i<alphabets.length; i++) {
	      	for(int j=0; j<lowerName.length(); j++) {
	          if(alphabets[i] == lowerName.charAt(j)) {
	          	count++;
	            break;
	          }
	        }
	      }
	      if(count == 26) {
	        System.out.println("The string is a pangram");
	      } else {
	      	System.out.println("The string isn't a pangram");
	      }

	}

}

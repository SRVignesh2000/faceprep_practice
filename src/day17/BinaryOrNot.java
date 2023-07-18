package day17;

import java.util.Scanner;

public class BinaryOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int count = 0;
		// System.out.println(input.charAt(0));

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '0' || input.charAt(i) == '1') {
				count++;
				// System.out.println(count);
			}
		}
		if (count == input.length()) {
			System.out.println("Binary String");
		} else {
			System.out.println("Not a Binary String");
		}
		
		//method 2
//		Scanner sc = new Scanner(System.in);
//	    String line = sc.nextLine();
//	    
//	    String finalString = line.replaceAll("[0-1]","");
//	    
//	    if(finalString.length() == 0){
//	    System.out.println("Binary String");
//	    }else{
//	        System.out.println("Not a Binary String");
//	    }

	}

}

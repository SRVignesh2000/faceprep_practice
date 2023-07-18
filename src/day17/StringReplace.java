package day17;

import java.util.Scanner;

public class StringReplace {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String string1 = scanner.nextLine();

	        String string2 = scanner.nextLine();
	     

	        if (string1.contains(String.valueOf(string2.charAt(0)))) {
	            string1 = string1.substring(0, string1.indexOf(string2.charAt(0))) + string2;
	        } else {
	            string1 += " " + string2;
	        }

	        System.out.println( string1);

	}

}

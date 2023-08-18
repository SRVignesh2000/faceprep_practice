package day25;

import java.util.*;

public class Wordanthakshari {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");

		String name = sc.next();
		System.out.println(name);

		String second = "";
		boolean status = true;
		
		if(name.contains("#")) {
			status = false;
		}

		while (status) {
			
			
			
			char last = name.charAt(name.length() - 1);

			second = sc.next();
			if(second.contains("#")) {
				status = false;
			}

			char first = second.charAt(0);

			if (last == first) {
				System.out.println(second + "");
				name = second;
				
			} else {
				name = second;
				
			}
		}

	}

}

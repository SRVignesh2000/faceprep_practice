package day16;

import java.util.Scanner;

public class ReplaceTheString {

	public static void main(String args[]) {
//		Give me some sunshine
//
//		sunshine
//
//		rain
		
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		str = str.replace(str1, str2);
		System.out.println(str);

	}

}

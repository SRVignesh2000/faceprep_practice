package day17;

import java.util.Scanner;

public class AllVowelsPresentedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String vowels = "aeiou";
		String nameLower = name.toLowerCase();
		int count = 0;
		for (int i = 0; i < vowels.length(); i++) {
			for (int j = 0; j < nameLower.length(); j++) {
				if (vowels.charAt(i) == nameLower.charAt(j)) {
					count++;
					break;
				}
			}
		}

		if (count == vowels.length()) {
			System.out.println("Accepted");
		} else {
			System.out.println("Not Accepted");
		}
		
		
		//method 2
//		   Scanner sc=new Scanner(System.in);
//		    
//		    String str=sc.nextLine().toLowerCase();
//		    
//		    if(str.contains("a")&&str.contains("e")&&str.contains("i")&&str.contains("o")&&str.contains("u")){
//		    System.out.println("Accepted");
//		    }else{
//		     System.out.println("Not Accepted");
//		    }

	}

}

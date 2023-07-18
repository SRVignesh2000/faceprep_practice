package day16;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String name1 = sc.nextLine();
		String lowerName = name.toLowerCase();
		String lowerName1 = name1.toLowerCase();

		String[] arr = lowerName.split("");
		String[] arr1 = lowerName1.split("");

		if (arr.length == arr1.length) {
			int count = 0;

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr1.length; j++) {
					if (arr[i].equals(arr1[j])) {
						count++;
						break;

					}
				}
			}

			if (count == arr.length) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not an anagram");
			}
		} else {
			System.out.println("Not an anagram");
		}
		
		
		// original method
//		Scanner sc = new Scanner(System.in);
//		   String a = sc.nextLine().toLowerCase();
//		   String b = sc.nextLine().toLowerCase();
//		    char[] c=b.toCharArray();
//		    Arrays.sort(c);
//		    b=Arrays.toString(c);
//		    char[] d=a.toCharArray();
//		    Arrays.sort(d);
//		    a=Arrays.toString(d);
//		    if(a.length()==b.length())
//		    {
//		   if(a.equals(b)){
//		   System.out.println("Anagram");
//		   }else{
//		    System.out.println("Not an anagram");
//		   }
//		    }
//		   else
//		     System.out.print("Not an anagram");
//		    }
//		  }

	}

}

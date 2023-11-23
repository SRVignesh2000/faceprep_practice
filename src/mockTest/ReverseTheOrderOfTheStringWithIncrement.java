package mockTest;

import java.util.Scanner;

public class ReverseTheOrderOfTheStringWithIncrement {
	
	public static void main(String[] args) {
		
		// if string name = yum means y->2; u->1; m->0;
		// so answer is y+2 = a; u+1 = v; m+0 = m;
		// answer is avm
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] arr = str.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			String s = arr[i];
			int k = s.length()-1;
			
			for(int j=0; j<=s.length()-1; j++) {
				char ch = s.charAt(j);
				
				if((int)ch >=65 && (int)ch <=90) {
					upperCase(s.charAt(j), k--);
				} else {
					lowerCase(s.charAt(j), k--);
				}
			}
			System.out.print(" ");
		}
		
	}
	
	
	public static void upperCase(char ch, int k) {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int index = (upper.indexOf(ch) + k) % upper.length();
		System.out.print(upper.charAt(index));
		
	}
	
	public static void lowerCase(char ch, int k) {
		String lower = "abcdefghijklmnopqrstuvwxyz";
		
		int index = (lower.indexOf(ch) + k) % lower.length();
		System.out.print(lower.charAt(index));
	}

}

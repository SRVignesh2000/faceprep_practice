package day16;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxMinChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Apple is good for health";
		String replaced = name.replaceAll(" ", "").toLowerCase();
		
		String[] arr = replaced.split("");
		
		Arrays.sort(arr);
		
//		String[] alphabets = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		
		
		int max = 0;
		int min = arr.length;
		char maxDigit = ' ';
		
		char minDigit = ' ';
		int index = 0;
		for(int i=0; i<alphabets.length(); i++) {
			int count = 0;
			
			for(int j=replaced.length()-1; j>=0; j--) {
				
				if(alphabets.charAt(i) == replaced.charAt(j)) {
					count++;
				}
				index = j;
				
			}
			
//			System.out.println(charAt());
			if(count > 0) {
				if(max < count) {
					max = count;
					maxDigit = replaced.charAt(index);
//					System.out.println("count"+count);
//					System.out.println(maxDigit);
					replaced = replaced.replaceAll(alphabets.charAt(i)+"", "");
//					System.out.println(replaced);
				}
				if(min > count) {// 10 > 1
					min = count;
					minDigit = replaced.charAt(index);
//					System.out.println("count"+count);
//					System.out.println(minDigit);
					replaced = replaced.replaceAll(alphabets.charAt(i)+"", "");
//					System.out.println(replaced);
				}
			}
			
		}
		
		
//		for(int i=0; i<name.length(); i++) {
//			
//			for(int j=0; j<arr.length; j++) {
//				
//				if(name.charAt(i))
//			}
//			
//		}
		
//		System.out.println(Arrays.toString(arr));
		//System.out.println(replaced);
		System.out.println(maxDigit);
		System.out.println(minDigit);

	}

}

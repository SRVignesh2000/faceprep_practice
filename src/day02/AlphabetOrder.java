package day02;

import java.util.Arrays;

public class AlphabetOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//method 1
		
//		String name = "Faceprep";
//
//		String[] splited = name.split("");
//
//		String[] lower = name.toLowerCase().split("");
//
//		String[] alphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
//				"s", "t", "u", "v", "w", "x", "y", "z" };
//
//		StringBuilder replaced = new StringBuilder();
//
//		for (int i = 0; i < alphabets.length; i++) {
//			for (int j = 0; j < lower.length; j++) {
//				if (alphabets[i].equals(lower[j])) {
//					replaced.append(splited[j]);
//				}
//			}
//		}
//		System.out.println(replaced);
		
		
		
		//method 2
		String sentence = "faceprep";
		
        String[] characters = sentence.split("");
        
        Arrays.sort(characters);
        
        StringBuilder output = new StringBuilder();
        
        for (String character : characters) {
            output.append(character);
        }
        System.out.println(output.toString());

	}

}

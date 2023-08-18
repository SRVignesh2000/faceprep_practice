package day30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().trim();

        // Create a HashMap to store the character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through each character in the word and update the frequency in the map
        for (char ch : word.toCharArray()) {
            
            if (Character.isLetter(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Sort the keys (characters) in alphabetical order
        ArrayList<Character> sortedCharacters = new ArrayList<>(frequencyMap.keySet());
        Collections.sort(sortedCharacters);

        // Print the character frequency in alphabetical order
        System.out.println("Character frequency in given text:");
        for (char ch : sortedCharacters) {
            System.out.print(ch + ":" + frequencyMap.get(ch) + " ");
        }
	}
}

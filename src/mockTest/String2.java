package mockTest;

public class String2 {

	public static void main(String[] args) {
		String word1 = "Silent";
		String word2 = "Listener";

		// Convert word2 to a StringBuilder to make it mutable
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < word2.length(); i++) {
			char currentChar = word2.charAt(i);

			// Check if the character is not present in word1
			if (word1.indexOf(currentChar) == -1) {
				result.append(currentChar);
			}
		}

		// Convert the StringBuilder back to a String
		String finalResult = result.toString();

		System.out.println(finalResult);
	}

}

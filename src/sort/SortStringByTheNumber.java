package sort;

public class SortStringByTheNumber {
	
	public static void main(String[] args) {
		
		// input How2 Hey!1 you4 are3
		
		String s = "How2 Hey!1 you4 are3";
		
		String[] words = s.split(" ");
        String[] originalSentence = new String[words.length];
        
        for (String word : words) {
        	
            int index = Integer.parseInt(word.replaceAll("[^0-9]", ""));
            
            // ^ denotes that replaceAll the characters not in range 0-9
            
            originalSentence[index - 1] = word.replaceAll("[0-9]", "");
        }
		
	}

}

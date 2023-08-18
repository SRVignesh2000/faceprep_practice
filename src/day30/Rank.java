package day30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Rank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> studentMarks = new HashMap<>();
		for (int i = 0; i < 3; i++) {
			String name = scanner.nextLine();
			int marks = Integer.parseInt(scanner.nextLine());
			studentMarks.put(name, marks);
		}
		// Sort the map by marks in descending order
		List<Map.Entry<String, Integer>> sortedMarksList = new ArrayList<>(studentMarks.entrySet());
		sortedMarksList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
		// Print the ranks based on the sorted map
		System.out.println("The ranks based on their marks:");
		int rank = 1;
		for (Map.Entry<String, Integer> entry : sortedMarksList) {
			System.out.println("Rank " + rank + ": " + entry.getKey());
			rank++;
		}
		scanner.close();
	}

}

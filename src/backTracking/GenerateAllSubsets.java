package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GenerateAllSubsets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			array[i] = scanner.nextInt();
		}

		Arrays.sort(array);
		generateSubsets(array, new ArrayList<>(), 0);

		scanner.close();
	}

	public static void generateSubsets(int[] array, List<Integer> subset, int index) {
		if (!subset.isEmpty()) {
			for (int num : subset) {
				System.out.print(num + " ");
			}

			System.out.println();
		}

		for (int i = index; i < array.length; i++) {
			subset.add(array[i]);
			generateSubsets(array, subset, i + 1);
			subset.remove(subset.size() - 1);
		}
	}

}

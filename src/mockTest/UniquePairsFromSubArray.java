package mockTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UniquePairsFromSubArray {

	// 3,4,5,2,1

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];

		List<int[]> answer = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {

				List<Integer> newArr = new ArrayList<>();

				for (int k = i; k <= j; k++) {

					newArr.add(arr[k]);
				}
				
				System.out.println(newArr);

				if (newArr.size() > 1) {
					Collections.sort(newArr);
					int[] arr2 = new int[2];
					arr2[0] = newArr.get(newArr.size() - 1);
					arr2[1] = newArr.get(newArr.size() - 2);

					if (answer.size() == 0) {

						answer.add(arr2);

					} else {

						boolean present = false;

						for (int m = 0; m < answer.size(); m++) {

							if (Arrays.equals(arr2, answer.get(m)) == true) {
								present = true;
								break;
							}
						}
						if (!present) {
							answer.add(arr2);
						}
					}
				}

			}

		}

		for (int[] i : answer) {
			System.out.println(Arrays.toString(i));
		}
		
		System.out.println("answer is "+ answer.size());
		
		scanner.close();

	}

}

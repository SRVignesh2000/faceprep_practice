package day18;

import java.util.ArrayList;

public class DuplicatesArray {

	// TODO Auto-generated method stub

//		Sample input:
//			6
//			11 11 11 13 13 20

	public static void arr1(int[] arrName) {
		// System.out.println(Arrays.toString(arrName));

		ArrayList<Integer> newArr = new ArrayList<Integer>();

		for (int i = 0; i < arrName.length; i++) {
			boolean isDistinct = true;

			for (int j = 0; j < i; j++) {
				if (arrName[i] == arrName[j]) {
					isDistinct = false;
					break;
				}
			}

			if (isDistinct) {
				newArr.add(arrName[i]);
			}

		}

		System.out.println(newArr);
	}

	public static void main(String args[]) {
		int[] arr = { 10, 9, 15, 15, 9, 8 };

		arr1(arr);

	}

}

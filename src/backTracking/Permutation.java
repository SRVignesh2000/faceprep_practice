package backTracking;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Permutation {

	static TreeSet<String> ans = new TreeSet<>();

	static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void perm(char[] arr, int fi) {

		if (fi == arr.length - 1) {
			ans.add(String.valueOf(arr));
			return;
		}
		for (int i = fi; i < arr.length; i++) {
			swap(arr, i, fi);
			perm(arr, fi + 1);
			swap(arr, i, fi);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		char[] arr = val.toCharArray();

		Arrays.sort(arr);
		perm(arr, 0);

		for (String s : ans) {
			System.out.println(s);
		}

	}

//	static void sortedPermutations(char[] str) {
//		Arrays.sort(str);
//		boolean isFinished = false;
//		while (!isFinished) {
//			System.out.println(String.valueOf(str));
//			int i;
//			for (i = str.length - 2; i >= 0; i--) {
//				if (str[i] < str[i + 1]) {
//					break;
//				}
//			}
//			if (i == -1) {
//				isFinished = true;
//			} else {
//				int ceilIndex = i + 1;
//				for (int j = i + 2; j < str.length; j++) {
//					if (str[j] > str[i] && str[j] < str[ceilIndex]) {
//						ceilIndex = j;
//					}
//				}
//				char temp = str[i];
//				str[i] = str[ceilIndex];
//				str[ceilIndex] = temp;
//				Arrays.sort(str, i + 1, str.length);
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String val = sc.nextLine();
//		char[] str = val.toCharArray();
//		sortedPermutations(str);
//	}

}

package day16;

import java.util.Arrays;
import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String a = input.nextLine().toLowerCase();
		int n = a.length();
		int l = (n * (n + 1)) / 2;
		String[] arr = new String[l];
		int count = 0;
		for (int k = 0; k < n; k++) {
			for (int i = 0, j = 1 + k; j <= n; i++, j++) {
				arr[count] = a.substring(i, j);
				count++;
			}
		}
		System.out.println("Sorted Substring");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		String[] newName = name.split("");
//		String[] oldName = name.split("");
//		Arrays.sort(newName);
//		for (int i = 0; i < newName.length; i++) {// sort
//			String out = "";
//			for (int j = 0; j < oldName.length; j++) {// palasu
//				if (newName[i].equals(oldName[oldName.length - 1 - j])) {
//					for (int k = oldName.length - 1 - j; k < oldName.length; k++) {
//						out += oldName[j];
//						System.out.println(out);
//
//					}
//				}
//
//			}
//
//		}
	}

}

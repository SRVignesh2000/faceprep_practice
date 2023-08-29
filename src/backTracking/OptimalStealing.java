package backTracking;

import java.util.Scanner;

public class OptimalStealing {

	public static int steal(int[] a, int n) {
		if (n == 0) {
			return a[0];
		}
		if (n < 0) {
			return 0;
		}
		int choosen = a[n] + steal(a, n - 2);
		int not_choosen = steal(a, n - 1);
		if (choosen > not_choosen) {
			return choosen;
		} else {
			return not_choosen;
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = steal(arr, n - 1);
		System.out.println(ans);
	}

}

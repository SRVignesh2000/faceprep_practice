package mockTest;

import java.util.*;

public class CubicIntegerCountFinder {

	public static void main(String[] args) {
		
		// input n = 1 and arr[i] = 2;

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int ans = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

			ans += findCubicNumber(arr[i], n);
		}

		sc.close();

		System.out.println(ans);

	}

	public static int findCubicNumber(int s, int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				

				int x = (int) Math.pow(i, 3);
				int y = (int) Math.pow(j, 3);
				
//				System.out.println(x+y);

				if (x + y == s) {
					
					return 1;
				}

			}
		}

		return 0;
	}

}

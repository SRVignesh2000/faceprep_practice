package pattern;

import java.util.ArrayList;

public class Hosoya {

	public static void main(String args[]) {

		int n = 6;

		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();

		arr1.add(1);
		arr2.add(1);
		arr2.add(1);

		for (int i = 0; i < n; i++) {

			ArrayList<Integer> arr3 = new ArrayList<>();

			for (int j = n - 1; j > i; j--) {
				System.out.print("*");
			}

			for (int j = 0; j <= i; j++) {

				if (i == 0) {
					System.out.print(arr1.get(j) + " ");
				}
				if (i == 1) {
					System.out.print(arr2.get(j) + " ");
				} else if (i > 1) {
					if (j == i - 1) {
						int a = arr2.get(j);
						System.out.print(a + " ");
						arr3.add(a);

					} else if (j == i) {

						int a = arr3.get(0);
						System.out.print(a + " ");
						arr3.add(a);

						arr1 = arr2;
						arr2 = arr3;

					} else {
						int a = arr1.get(j) + arr2.get(j);
						System.out.print(a + " ");
						arr3.add(a);
					}

				}

			}

			System.out.println();
		}

	}

	
	// method 2
//	class GFG {
//		public static void printHosoya(int n) {
//			int[][] dp = new int[n][n];
//
//			dp[0][0] = dp[1][0] = dp[1][1] = 1;
//
//			for (int i = 2; i < n; i++) {// i=2,3
//
//				for (int j = 0; j < n; j++) {// j=0,1,2,3
//
//					if (i > j)// 2>0 2>1
//						dp[i][j] = dp[i - 1][j] + dp[i - 2][j];// dp[2][0]=1+1=2
//
//					else
//						dp[i][j] = dp[i - 1][j - 1] + dp[i - 2][j - 2];// dp[2][2]=1+1=2 dp[2][3]=0+0=0 dp[2][4]=0
//				}
//			}
//			int temp;
//
//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j <= i; j++) {
//					temp = 96 + dp[i][j];
//					System.out.print((char) temp);
//				}
//
//				System.out.println();
//			}
//		}
//
//		public static void main(String[] args) {
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			printHosoya(n);
//		}
//	}

}

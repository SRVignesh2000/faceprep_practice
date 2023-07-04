package day07;

import java.util.Scanner;

public class NthTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt(); // First number
            int b = scanner.nextInt(); // Second number
            int c = scanner.nextInt(); // Third number
            int n = scanner.nextInt(); // Value of n

            int nthTerm = findNthTerm(a, b, c, n);
            System.out.println(nthTerm);
        }

        scanner.close();
    }

    public static int findNthTerm(int a, int b, int c, int n) {
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            return b;
        }
        if (n == 3) {
            return c;
        }

        int[] series = new int[n];
        series[0] = a;
        series[1] = b;
        series[2] = c;

        for (int i = 3; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2] + series[i - 3];
        }

        return series[n - 1];

	}

}

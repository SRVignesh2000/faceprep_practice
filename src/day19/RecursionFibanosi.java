package day19;

public class RecursionFibanosi {

	public static int fibanosi(int n) {
		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		}
		return fibanosi(n - 1) + fibanosi(n - 2);
	}

	public static void main(String[] args) {
		int n = 5;

		System.out.print(fibanosi(n));
	}

}
